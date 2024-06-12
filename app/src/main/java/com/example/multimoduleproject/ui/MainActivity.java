package com.example.multimoduleproject.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.detailhero.ui.DetailHeroActivity;
import com.example.findmatches.ui.FindMatchesActivity;
import com.example.hero.ui.HeroActivity;
import com.example.multimoduleproject.R;

public class MainActivity extends AppCompatActivity {
    private Button btn_hero, btn_detail_hero, btn_find_matches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_hero = findViewById(R.id.btn_hero);
        btn_detail_hero = findViewById(R.id.btn_detail_hero);
        btn_find_matches = findViewById(R.id.btn_find_matches);

        btn_hero.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, HeroActivity.class));
        });

        btn_detail_hero.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DetailHeroActivity.class));
        });

        btn_find_matches.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, FindMatchesActivity.class));
        });

    }
}
