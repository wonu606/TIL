package com.wonu606.decoratorpattern.orderingcoffee.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블렌드 커피";

    }

    @Override
    public double cost() {
        return 0.89;
    }
}
