package com.example.network.network;

import com.example.network.network.models.Hero;
import com.example.network.network.models.HeroStats;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("heroes")
    Call<List<Hero>> getHero();

    @GET("heroStats")
    Call<List<HeroStats>> getHeroes();
}
