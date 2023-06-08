package com.wonu606.strategypattern.duck.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
