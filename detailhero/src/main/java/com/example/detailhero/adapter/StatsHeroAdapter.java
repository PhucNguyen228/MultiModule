package com.example.detailhero.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.detailhero.R;
import com.example.network.network.models.HeroStats;

import java.util.List;

public class StatsHeroAdapter extends RecyclerView.Adapter<StatsHeroAdapter.StatsHeroViewHolder>{
    private List<HeroStats> listStatsHero;

    public StatsHeroAdapter(List<HeroStats> listStatsHero) {
        this.listStatsHero = listStatsHero;
    }

    public void setData(List<HeroStats> newHeroStatsList) {
        this.listStatsHero.clear();
        this.listStatsHero.addAll(newHeroStatsList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public StatsHeroAdapter.StatsHeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero_stats, parent, false);
        return new StatsHeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatsHeroAdapter.StatsHeroViewHolder holder, int position) {
        HeroStats heroStats = listStatsHero.get(position);
        holder.txt_name_hero.setText(heroStats.getLocalizedName());
        holder.txt_primary_attr.setText(heroStats.getPrimaryAttr());
        holder.txt_attack_type.setText(heroStats.getAttackType());

        String proWinPercentage = heroStats.getProWin() + "%";
        String turboWinsPercentage = heroStats.getTurboWins() + "%";

        holder.txt_pro_win.setText(proWinPercentage);
        holder.txt_turbo_wins.setText(turboWinsPercentage);

        Log.d("PHÚCKDJ", "onBindViewHolder: " + heroStats.getImg());
        // https://cdn.akamai.steamstatic.com/ + heroStats.getImg()

//        if u wnart show error img when load img fail .error(R.drawable.error)
        Glide.with(holder.itemView.getContext())
                .load("https://cdn.akamai.steamstatic.com" + heroStats.getImg())
                .placeholder(R.drawable.bgdota)
                .into(holder.img_hero);

        holder.txt_name_hero.setText(heroStats.getLocalizedName());

        Glide.with(holder.itemView.getContext())
                .load("https://cdn.akamai.steamstatic.com" + heroStats.getIcon())
                .placeholder(R.drawable.bgdota)
                .into(holder.img_icon_hero);

    }

    @Override
    public int getItemCount() {
        return listStatsHero.size();
    }

    public class StatsHeroViewHolder extends RecyclerView.ViewHolder {
        TextView txt_name_hero, txt_primary_attr, txt_attack_type, txt_pro_win, txt_turbo_wins;
        ImageView img_hero, img_icon_hero;

        public StatsHeroViewHolder(@NonNull View itemView) {
            super(itemView);
            img_hero = itemView.findViewById(R.id.img_hero);
            txt_name_hero = itemView.findViewById(R.id.txt_name_hero);
            img_icon_hero = itemView.findViewById(R.id.img_icon_hero);
            txt_primary_attr = itemView.findViewById(R.id.txt_primary_attr);
            txt_attack_type = itemView.findViewById(R.id.txt_attack_type);
            txt_pro_win = itemView.findViewById(R.id.txt_pro_win);
            txt_turbo_wins = itemView.findViewById(R.id.txt_turbo_wins);
        }
    }
}
