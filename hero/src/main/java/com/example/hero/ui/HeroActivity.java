package com.example.hero.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.detailhero.ui.DetailHeroActivity;
import com.example.hero.R;
import com.example.hero.adapter.HeroAdapter;
import com.example.network.network.ApiService;
import com.example.network.network.RetrofitClient;
import com.example.network.network.models.Hero;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HeroActivity extends AppCompatActivity {
    private Button btnDetailHero;
    private RecyclerView rvHero;
    private HeroAdapter heroAdapter;
    private List<Hero> heroList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);

        rvHero = findViewById(R.id.rv_heroes);
        rvHero.setLayoutManager(new LinearLayoutManager(this));
        heroList = new ArrayList<>();
        heroAdapter = new HeroAdapter(heroList);
        rvHero.setAdapter(heroAdapter);

        btnDetailHero = findViewById(R.id.btn_detail_hero);
        btnDetailHero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HeroActivity.this, DetailHeroActivity.class);
                startActivity(intent);
            }
        });

        fetchHeroes();
    }

    private void fetchHeroes() {
        ApiService apiService = RetrofitClient.getRetrofitService();
        Call<List<Hero>> call = apiService.getHero();
        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                if (response.isSuccessful()) {
                    heroList.addAll(response.body());
                    heroAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(HeroActivity.this, "Failed to get data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {
                Toast.makeText(HeroActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
