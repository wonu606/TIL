package com.wonu606.decoratorpattern.orderingcoffee;

import com.wonu606.decoratorpattern.orderingcoffee.beverage.Beverage;
import com.wonu606.decoratorpattern.orderingcoffee.beverage.DarkRoast;
import com.wonu606.decoratorpattern.orderingcoffee.beverage.Espresso;
import com.wonu606.decoratorpattern.orderingcoffee.beverage.HouseBlend;
import com.wonu606.decoratorpattern.orderingcoffee.beverage.condiment.Mocha;
import com.wonu606.decoratorpattern.orderingcoffee.beverage.condiment.Soy;
import com.wonu606.decoratorpattern.orderingcoffee.beverage.condiment.Whip;

public class starbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);
    }
}
