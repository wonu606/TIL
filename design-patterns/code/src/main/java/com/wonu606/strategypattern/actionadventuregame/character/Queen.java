package com.wonu606.strategypattern.actionadventuregame.character;

import com.wonu606.strategypattern.actionadventuregame.weapon.BowAndArrowBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
