package com.designpatterns;

public class Polimorphism {

    void pay()
    {
        System.out.println("payment processing");
    }
    public class RuntimePolimorphism extends Polimorphism
    {
        void pay()
        {
            System.out.println("payment done using api");
        }

    }
}
