package com.wonu606.observerpattern.stockmarket;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Investor> investors = new ArrayList<>();
    private double oldPrice;
    private double currentPrice;

    public Stock(double currentPrice) {
        oldPrice = 0;
        this.currentPrice = currentPrice;
    }

    public void addInvestor(Investor investor) {
        investors.add(investor);
    }

    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    public void setPrice(double floatingRate) {
        oldPrice = currentPrice;
        currentPrice = currentPrice * (100.0 + floatingRate) / 100.0;
        notifyInvestors(currentPrice, oldPrice);
    }

    private void notifyInvestors(double currentPrice, double oldPrice) {
        for (Investor investor : investors) {
            investor.update(currentPrice, oldPrice);
        }
    }
}
