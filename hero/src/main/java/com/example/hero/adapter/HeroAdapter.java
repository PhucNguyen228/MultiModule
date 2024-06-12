package com.example.hero.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hero.R;
import com.example.network.network.models.Hero;

import java.text.BreakIterator;
import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {
    private List<Hero> listHero;

    public HeroAdapter(List<Hero> listHero) {
        this.listHero = listHero;
    }

    @NonNull
    @Override
    public HeroAdapter.HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero, parent, false);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroAdapter.HeroViewHolder holder, int position) {
        Hero hero = listHero.get(position);
        holder.tvHeroName.setText(hero.getLocalized_name());
        holder.tvHeroPrimaryAttr.setText(hero.getPrimary_attr());
        holder.tvHeroAttackType.setText(hero.getAttack_type());
        holder.tvHeroRoles.setText(hero.getRolesString());
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    public class HeroViewHolder extends RecyclerView.ViewHolder {
        TextView tvHeroName, tvHeroPrimaryAttr, tvHeroAttackType, tvHeroRoles;
        public HeroViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHeroName = itemView.findViewById(R.id.tv_hero_name);
            tvHeroPrimaryAttr = itemView.findViewById(R.id.tv_hero_primary_attr);
            tvHeroAttackType = itemView.findViewById(R.id.tv_hero_attack_type);
            tvHeroRoles = itemView.findViewById(R.id.tv_hero_roles);
        }
    }
}
