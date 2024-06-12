package com.example.network.network.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HeroStats {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("localized_name")
    private String localizedName;
    @SerializedName("primary_attr")
    private String primaryAttr;
    @SerializedName("attack_type")
    private String attackType;
    @SerializedName("roles")
    private List<String> roles;
    @SerializedName("img")
    private String img;
    @SerializedName("icon")
    private String icon;
    @SerializedName("base_health")
    private int baseHealth;
    @SerializedName("base_health_regen")
    private double baseHealthRegen;
    @SerializedName("base_mana")
    private int baseMana;
    @SerializedName("base_mana_regen")
    private double baseManaRegen;
    @SerializedName("base_armor")
    private double baseArmor;
    @SerializedName("base_mr")
    private int baseMr;
    @SerializedName("base_attack_min")
    private int baseAttackMin;
    @SerializedName("base_attack_max")
    private int baseAttackMax;
    @SerializedName("base_str")
    private int baseStr;
    @SerializedName("base_agi")
    private int baseAgi;
    @SerializedName("base_int")
    private int baseInt;
    @SerializedName("str_gain")
    private double strGain;
    @SerializedName("agi_gain")
    private double agiGain;
    @SerializedName("int_gain")
    private double intGain;
    @SerializedName("attack_range")
    private int attackRange;
    @SerializedName("projectile_speed")
    private int projectileSpeed;
    @SerializedName("attack_rate")
    private double attackRate;
    @SerializedName("base_attack_time")
    private double baseAttackTime;
    @SerializedName("attack_point")
    private double attackPoint;
    @SerializedName("move_speed")
    private int moveSpeed;
    @SerializedName("turn_rate")
    private double turnRate;
    @SerializedName("cm_enabled")
    private boolean cmEnabled;
    @SerializedName("legs")
    private int legs;
    @SerializedName("day_vision")
    private int dayVision;
    @SerializedName("night_vision")
    private int nightVision;
    @SerializedName("hero_id")
    private int heroId;
    @SerializedName("turbo_picks")
    private int turboPicks;
    @SerializedName("turbo_wins")
    private int turboWins;
    @SerializedName("pro_ban")
    private int proBan;
    @SerializedName("pro_win")
    private int proWin;
    @SerializedName("pro_pick")
    private int proPick;
    @SerializedName("1_pick")
    private int pick1;
    @SerializedName("1_win")
    private int win1;
    @SerializedName("2_pick")
    private int pick2;
    @SerializedName("2_win")
    private int win2;
    @SerializedName("3_pick")
    private int pick3;
    @SerializedName("3_win")
    private int win3;
    @SerializedName("4_pick")
    private int pick4;
    @SerializedName("4_win")
    private int win4;
    @SerializedName("5_pick")
    private int pick5;
    @SerializedName("5_win")
    private int win5;
    @SerializedName("6_pick")
    private int pick6;
    @SerializedName("6_win")
    private int win6;
    @SerializedName("7_pick")
    private int pick7;
    @SerializedName("7_win")
    private int win7;
    @SerializedName("8_pick")
    private int pick8;
    @SerializedName("8_win")
    private int win8;

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

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getPrimaryAttr() {
        return primaryAttr;
    }

    public void setPrimaryAttr(String primaryAttr) {
        this.primaryAttr = primaryAttr;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    public double getBaseHealthRegen() {
        return baseHealthRegen;
    }

    public void setBaseHealthRegen(double baseHealthRegen) {
        this.baseHealthRegen = baseHealthRegen;
    }

    public int getBaseMana() {
        return baseMana;
    }

    public void setBaseMana(int baseMana) {
        this.baseMana = baseMana;
    }

    public double getBaseManaRegen() {
        return baseManaRegen;
    }

    public void setBaseManaRegen(double baseManaRegen) {
        this.baseManaRegen = baseManaRegen;
    }

    public double getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(double baseArmor) {
        this.baseArmor = baseArmor;
    }

    public int getBaseMr() {
        return baseMr;
    }

    public void setBaseMr(int baseMr) {
        this.baseMr = baseMr;
    }

    public int getBaseAttackMin() {
        return baseAttackMin;
    }

    public void setBaseAttackMin(int baseAttackMin) {
        this.baseAttackMin = baseAttackMin;
    }

    public int getBaseAttackMax() {
        return baseAttackMax;
    }

    public void setBaseAttackMax(int baseAttackMax) {
        this.baseAttackMax = baseAttackMax;
    }

    public int getBaseStr() {
        return baseStr;
    }

    public void setBaseStr(int baseStr) {
        this.baseStr = baseStr;
    }

    public int getBaseAgi() {
        return baseAgi;
    }

    public void setBaseAgi(int baseAgi) {
        this.baseAgi = baseAgi;
    }

    public int getBaseInt() {
        return baseInt;
    }

    public void setBaseInt(int baseInt) {
        this.baseInt = baseInt;
    }

    public double getStrGain() {
        return strGain;
    }

    public void setStrGain(double strGain) {
        this.strGain = strGain;
    }

    public double getAgiGain() {
        return agiGain;
    }

    public void setAgiGain(double agiGain) {
        this.agiGain = agiGain;
    }

    public double getIntGain() {
        return intGain;
    }

    public void setIntGain(double intGain) {
        this.intGain = intGain;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public void setProjectileSpeed(int projectileSpeed) {
        this.projectileSpeed = projectileSpeed;
    }

    public double getAttackRate() {
        return attackRate;
    }

    public void setAttackRate(double attackRate) {
        this.attackRate = attackRate;
    }

    public double getBaseAttackTime() {
        return baseAttackTime;
    }

    public void setBaseAttackTime(double baseAttackTime) {
        this.baseAttackTime = baseAttackTime;
    }

    public double getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(double attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public double getTurnRate() {
        return turnRate;
    }

    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }

    public boolean isCmEnabled() {
        return cmEnabled;
    }

    public void setCmEnabled(boolean cmEnabled) {
        this.cmEnabled = cmEnabled;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getDayVision() {
        return dayVision;
    }

    public void setDayVision(int dayVision) {
        this.dayVision = dayVision;
    }

    public int getNightVision() {
        return nightVision;
    }

    public void setNightVision(int nightVision) {
        this.nightVision = nightVision;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public int getTurboPicks() {
        return turboPicks;
    }

    public void setTurboPicks(int turboPicks) {
        this.turboPicks = turboPicks;
    }

    public int getTurboWins() {
        return turboWins;
    }

    public void setTurboWins(int turboWins) {
        this.turboWins = turboWins;
    }

    public int getProBan() {
        return proBan;
    }

    public void setProBan(int proBan) {
        this.proBan = proBan;
    }

    public int getProWin() {
        return proWin;
    }

    public void setProWin(int proWin) {
        this.proWin = proWin;
    }

    public int getProPick() {
        return proPick;
    }

    public void setProPick(int proPick) {
        this.proPick = proPick;
    }

    public int getPick1() {
        return pick1;
    }

    public void setPick1(int pick1) {
        this.pick1 = pick1;
    }

    public int getWin1() {
        return win1;
    }

    public void setWin1(int win1) {
        this.win1 = win1;
    }

    public int getPick2() {
        return pick2;
    }

    public void setPick2(int pick2) {
        this.pick2 = pick2;
    }

    public int getWin2() {
        return win2;
    }

    public void setWin2(int win2) {
        this.win2 = win2;
    }

    public int getPick3() {
        return pick3;
    }

    public void setPick3(int pick3) {
        this.pick3 = pick3;
    }

    public int getWin3() {
        return win3;
    }

    public void setWin3(int win3) {
        this.win3 = win3;
    }

    public int getPick4() {
        return pick4;
    }

    public void setPick4(int pick4) {
        this.pick4 = pick4;
    }

    public int getWin4() {
        return win4;
    }

    public void setWin4(int win4) {
        this.win4 = win4;
    }

    public int getPick5() {
        return pick5;
    }

    public void setPick5(int pick5) {
        this.pick5 = pick5;
    }

    public int getWin5() {
        return win5;
    }

    public void setWin5(int win5) {
        this.win5 = win5;
    }

    public int getPick6() {
        return pick6;
    }

    public void setPick6(int pick6) {
        this.pick6 = pick6;
    }

    public int getWin6() {
        return win6;
    }

    public void setWin6(int win6) {
        this.win6 = win6;
    }

    public int getPick7() {
        return pick7;
    }

    public void setPick7(int pick7) {
        this.pick7 = pick7;
    }

    public int getWin7() {
        return win7;
    }

    public void setWin7(int win7) {
        this.win7 = win7;
    }

    public int getPick8() {
        return pick8;
    }

    public void setPick8(int pick8) {
        this.pick8 = pick8;
    }

    public int getWin8() {
        return win8;
    }

    public void setWin8(int win8) {
        this.win8 = win8;
    }



}
