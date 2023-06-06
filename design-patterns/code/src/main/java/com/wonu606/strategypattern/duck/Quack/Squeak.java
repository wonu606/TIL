package com.wonu606.strategypattern.duck.Quack;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("삐익-");
    }
}
