package com.wonu606.strategypattern.duck;

import com.wonu606.strategypattern.duck.Quack.QuackBehavior;
import com.wonu606.strategypattern.duck.fly.FlyBehavior;

public class ModelDuck extends Duck {

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
