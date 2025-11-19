package com.designpatterns;

public class Main1
{
    public static void main(String[] args)
    {
        Checkout checkout=new Checkout(new FestivalDiscount());
        System.out.println("final price"+checkout.calculatePrice(10000));
    }
}
