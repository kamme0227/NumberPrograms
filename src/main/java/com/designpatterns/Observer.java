package com.designpatterns;

import java.util.ArrayList;
import java.util.List;

public interface Observer {

    void update(String stockname, double price);
}

class StockMarket
{
    private final List<Observer> observers=new ArrayList<>();

    public void register(Observer observer)
    {
        observers.add(observer);
    }
    public void notifyAllObserver(String stockname, double price)
    {
        for(Observer observer: observers)
        {
            observer.update(stockname,price);
        }
    }
}

class MobileDisplay implements Observer
{
  public void update(String stockname, double price)
  {
      System.out.println("stock name"+stockname+"update to"+price);
  }
}
class WebDisplay implements Observer
{
    public void update(String stockname, double price)
    {
        System.out.println("Stock name"+stockname+"update to"+price);
    }
}

