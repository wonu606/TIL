package com.wonu606.observerpattern.stockmarket;

public class ConcreteInvestor implements Investor {

    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(double currentPrice, double oldPrice) {
        System.out.printf(
                "%s: 주식 가격이 %f에서 %f로 변동되었습니다.\n"
                , name, oldPrice, currentPrice);
    }
}
