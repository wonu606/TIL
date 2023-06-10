package com.wonu606.observerpattern.stockmarket;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock(100.0);

        System.out.println("day1");
        stock.setPrice(30.0);

        Investor investor1 = new ConcreteInvestor("Taehak Yoo");
        stock.addInvestor(investor1);

        System.out.println("day2");
        stock.setPrice(-30.0);

        Investor investor2 = new ConcreteInvestor("Myungsoon Kang");
        stock.addInvestor(investor2);

        System.out.println("day3");
        stock.setPrice(30.0);

        Investor investor3 = new ConcreteInvestor("Wonwoo Yoo");
        Investor investor4 = new ConcreteInvestor("Yoo Ji-Hye");
        stock.addInvestor(investor3);
        stock.addInvestor(investor4);

        System.out.println("day4");
        stock.setPrice(30.0);

        stock.removeInvestor(investor1);

        System.out.println("day5");
        stock.setPrice(30.0);
    }
}
