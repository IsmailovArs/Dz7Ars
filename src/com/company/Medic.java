package com.company;

public class Medic extends Hero{
    @Override
    public String Ability(String superAbilityTupe) {
        return "Медик пременил " + superAbilityTupe;
    }
}
