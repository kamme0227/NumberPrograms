package com.designpatterns;

public class Main2
{
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.register(new MobileDisplay());
        market.register(new WebDisplay());
        
        market.notifyAllObserver("TCS",360.0);
    }
}
