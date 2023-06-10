package com.wonu606.decoratorpattern.orderingcoffee.beverage.condiment;

import com.wonu606.decoratorpattern.orderingcoffee.beverage.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
        description = "휘핑크림";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
