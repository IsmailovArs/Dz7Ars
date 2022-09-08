package com.company;

public class Main {
    public static void main(String[] args) {

        Mag mag = new Mag();
        mag.setHP(190);
        mag.setDM(30);
        mag.setSuperSkill(mag.Ability("СУПЕР МАГИЮ"));


        Medic medic = new Medic();
        medic.setHP(250);
        medic.setDM(10);
        medic.setSuperSkill(medic.Ability("Лечение "));


        Warrior warrior = new Warrior();
        warrior.setHP(300);
        warrior.setDM(50);
        warrior.setSuperSkill( warrior.Ability("Мощный Удар "));


        Hero hero [] ={mag, medic,warrior};
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i].getSuperSkill());

        }
    }
}
