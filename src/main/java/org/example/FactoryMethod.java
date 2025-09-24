package org.example;

import javax.rmi.ssl.SslRMIClientSocketFactory;

interface Shape
{
    void draw();
}

class Circle implements Shape
{
  public void draw()
  {
      System.out.println("Circle");
  }
}
class Square implements Shape
{
    public void draw()
    {
        System.out.println("Square");
    }
}
class ShapeFactory
{

    public Shape getShape(String type)
    {
        if(type.equalsIgnoreCase("Circle"))
            return new Circle();
        if(type.equalsIgnoreCase("Square"))
            return new Square();
        return null;
    }
}

public class FactoryMethod
{
    public static void main(String[] args)
    {
        ShapeFactory factory=new ShapeFactory();
        Shape s1=factory.getShape("Circle");
        s1.draw();
    }
}