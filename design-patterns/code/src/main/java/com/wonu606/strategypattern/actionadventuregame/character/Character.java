package com.wonu606.strategypattern.actionadventuregame.character;

import com.wonu606.strategypattern.actionadventuregame.weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
