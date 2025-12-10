package com.polimorphism;

import javax.sql.rowset.spi.SyncResolver;

public  class Animals implements A,B
{
    public void methodA()
    {
        System.out.println("Multiple inherintance");
    }
    public void methodB()
    {
        System.out.println("second method o interface");
    }

    public static void main(String[] args)
    {
        Animals obj=new Animals();
        obj.methodA();
        obj.methodB();
    }
}
