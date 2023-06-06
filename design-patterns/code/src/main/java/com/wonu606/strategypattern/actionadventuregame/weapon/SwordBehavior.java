package com.wonu606.strategypattern.actionadventuregame.weapon;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("검을 휘두릅니다.");
    }
}
