package com.wonu606.strategypattern.duck;

import com.wonu606.strategypattern.duck.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다.");
    }
}
