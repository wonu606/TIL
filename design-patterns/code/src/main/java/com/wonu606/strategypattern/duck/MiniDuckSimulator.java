package com.wonu606.strategypattern.duck;

import com.wonu606.strategypattern.duck.fly.FlyWithWings;
import com.wonu606.strategypattern.duck.Quack.MuteQuack;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        System.out.println("======mallard======");
        mallard.performFly();
        mallard.performQuack();

        System.out.println("======Model======");
        Duck model = new ModelDuck(new FlyWithWings(), new MuteQuack());
        model.performFly();
        model.performQuack();

        System.out.println("======Model 비행 행위 변경======");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
    }
}
