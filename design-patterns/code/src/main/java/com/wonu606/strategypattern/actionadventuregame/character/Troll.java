package com.wonu606.strategypattern.actionadventuregame.character;

import com.wonu606.strategypattern.actionadventuregame.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
