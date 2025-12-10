package com.polimorphism;

public class Dog extends Animal
{

    public void sound()
    {
        System.out.println("Override");
    }
    public void sound(String name) //over load
    {
        System.out.println("Animal make sounds"+name);
    }

    public static void main(String[] args)
    {
        Dog dog=new Dog();

        dog.sound();
        dog.sound("sheep");
    }
}
