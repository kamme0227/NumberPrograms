package org.example;

public class RecursionFactorial {
//    public static void main(String[] args)
//    {
//        int number =5;
//        System.out.println("Factorial number "+number+"="+factorial(number));
//    }
//
//    static int factorial(int n)
//    {
//        if(n==0 || n==1)
//        {
//            return 1;
//        }
//       return n * factorial(n-1);
//    }

    public static void main(String[] args)
   {
//        int number=5;
//
//        int fact=1;
//
//        for(int i=1;i<=5;i++)
//        {
//            fact=fact*i;
//
//
//        }
//        System.out.println(fact);

       int number=5;

       System.out.println("Factorial of "+number+"="+factorial(number));

    }

    static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+factorial(n-1);
    }
}
