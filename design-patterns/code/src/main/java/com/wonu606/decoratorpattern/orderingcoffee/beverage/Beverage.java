package com.wonu606.decoratorpattern.orderingcoffee.beverage;

public abstract class Beverage {

    protected String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
