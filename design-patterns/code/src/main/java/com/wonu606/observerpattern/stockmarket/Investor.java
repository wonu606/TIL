package com.wonu606.observerpattern.stockmarket;

public interface Investor {

    void update(double currentPrice, double oldPrice);
}
