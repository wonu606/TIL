package com.wonu606.strategypattern.actionadventuregame.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("활을 쏩니다.");
    }
}
