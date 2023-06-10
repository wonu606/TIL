package com.wonu606.decoratorpattern.orderingcoffee.beverage.condiment;

import com.wonu606.decoratorpattern.orderingcoffee.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }
}
