package com.wonu606.strategypattern.actionadventuregame.weapon;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("도끼를 내려찍습니다.");
    }
}
