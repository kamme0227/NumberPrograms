package com.abstractclass;

abstract public class Super
{
 public Super()
 {
     System.out.println("Constructor of super");
 }
 public void meth1()
 {
     System.out.println("Method1 of super");
 }
 abstract void meth2();
}
class Sub extends Super
    {
        @Override
        public void meth2 ()
        {
            System.out.println("Calling method2");
        }
    }

