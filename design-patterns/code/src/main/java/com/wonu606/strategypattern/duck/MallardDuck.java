package com.wonu606.strategypattern.duck;

import com.wonu606.strategypattern.duck.Quack.Quack;
import com.wonu606.strategypattern.duck.fly.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 청둥오리입니다!");
    }
}
