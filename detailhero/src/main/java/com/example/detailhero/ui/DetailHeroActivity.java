package com.example.detailhero.ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.detailhero.R;
import com.example.detailhero.adapter.StatsHeroAdapter;
import com.example.network.network.ApiService;
import com.example.network.network.RetrofitClient;
import com.example.network.network.models.HeroStats;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailHeroActivity extends AppCompatActivity {

    private RecyclerView rvStatsHero;
    private StatsHeroAdapter statsHeroAdapter;
    private List<HeroStats> heroStatsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_hero);

        rvStatsHero = findViewById(R.id.rv_hero_stats);
        rvStatsHero.setLayoutManager(new LinearLayoutManager(this));

        heroStatsList = new ArrayList<>();
        statsHeroAdapter = new StatsHeroAdapter(heroStatsList);
        rvStatsHero.setAdapter(statsHeroAdapter);

        fetchHeroStats();
    }

    private void fetchHeroStats() {
        ApiService apiService = RetrofitClient.getRetrofitService();
        Call<List<HeroStats>> call = apiService.getHeroes();
        call.enqueue(new Callback<List<HeroStats>>() {
            @Override
            public void onResponse(Call<List<HeroStats>> call, Response<List<HeroStats>> response) {
                if (response.isSuccessful()) {
                    heroStatsList = response.body();
                    if (heroStatsList != null) {
                        statsHeroAdapter.setData(heroStatsList);
                        statsHeroAdapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<HeroStats>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}