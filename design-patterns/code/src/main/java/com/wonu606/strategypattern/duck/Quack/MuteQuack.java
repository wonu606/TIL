package com.wonu606.strategypattern.duck.Quack;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
