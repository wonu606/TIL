package com.wonu606.decoratorpattern.orderingcoffee.beverage.condiment;

import com.wonu606.decoratorpattern.orderingcoffee.beverage.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
        description = "우유";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
