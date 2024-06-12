package com.example.network.network.models;

import java.util.List;

public class Hero {
    private int id;
    private String name;
    private String localized_name;
    private String primary_attr;
    private String attack_type;
    private List<String> roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalized_name() {
        return localized_name;
    }

    public void setLocalized_name(String localized_name) {
        this.localized_name = localized_name;
    }

    public String getPrimary_attr() {
        return primary_attr;
    }

    public void setPrimary_attr(String primary_attr) {
        this.primary_attr = primary_attr;
    }

    public String getAttack_type() {
        return attack_type;
    }

    public void setAttack_type(String attack_type) {
        this.attack_type = attack_type;
    }

    public List<String> getRoles() {
        return roles;
    }

    public String getRolesString() {
        return String.join(", ", roles);
    }


    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", localized_name='" + localized_name + '\'' +
                ", primary_attr='" + primary_attr + '\'' +
                ", attack_type='" + attack_type + '\'' +
                ", roles=" + roles +
                '}';
    }

    public Hero(int id, String name, String localized_name, String primary_attr, String attack_type, List<String> roles) {
        this.id = id;
        this.name = name;
        this.localized_name = localized_name;
        this.primary_attr = primary_attr;
        this.attack_type = attack_type;
        this.roles = roles;
    }
}
