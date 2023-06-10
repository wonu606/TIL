package com.wonu606.decoratorpattern.orderingcoffee.beverage.condiment;

import com.wonu606.decoratorpattern.orderingcoffee.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
        description = "모카";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
