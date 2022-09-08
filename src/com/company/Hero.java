package com.company;

public abstract class Hero implements HavingSuperAbility{
    private int HP;
    private int DM;
    private String superSkill;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDM() {
        return DM;
    }

    public void setDM(int DM) {
        this.DM = DM;
    }

    public String getSuperSkill() {
        return superSkill;
    }

    public void setSuperSkill(String superSkill) {
        this.superSkill = superSkill;
    }
}

