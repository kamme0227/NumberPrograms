package com.designpatterns;

public class NoDiscount implements DiscountStrategy
{
    public double applyDiscount(double price)
    {
        return price;
    }
}

class FestivalDiscount implements DiscountStrategy
{
    public double applyDiscount(double price)
    {
        return price *0.9;
    }
}

class NewUserDiscount implements DiscountStrategy
{
    public double applyDiscount(double price)
    {
        return price *0.8;
    }
}

class Checkout
{
    private DiscountStrategy strategy;

    public Checkout(DiscountStrategy strategy)
    {
        this.strategy=strategy;
    }

    public double calculatePrice(double price)
    {
        return strategy.applyDiscount(price);
    }
}

