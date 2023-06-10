package com.wonu606.decoratorpattern.orderingcoffee.beverage.condiment;

import com.wonu606.decoratorpattern.orderingcoffee.beverage.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
        description = "두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
