package com.wonu606.strategypattern.actionadventuregame.character;

import com.wonu606.strategypattern.actionadventuregame.weapon.SwordBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
