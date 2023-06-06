package com.wonu606.strategypattern.actionadventuregame.character;

import com.wonu606.strategypattern.actionadventuregame.weapon.KnifeBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }
}
