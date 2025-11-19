package Streams;

public class Recursion {
    public static void main(String[] args)
    {
        int number=5;
        System.out.println("Factorial of number "+factorial(number));
    }
    public static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*factorial(n-1);

    }
}
