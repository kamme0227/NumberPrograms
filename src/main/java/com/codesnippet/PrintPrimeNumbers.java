package com.codesnippet;

public class PrintPrimeNumbers {

    public static void main(String[] args) {

        // Generate prime numbers from 0 to 100

//        List<Integer> list= IntStream.rangeClosed(2,100).filter(i->IntStream.rangeClosed(2,(int)Math.sqrt(i)).noneMatch(n->i%n==0)).boxed().toList();
//
//        System.out.println(list);


        int number = 25;
        if(isPrime(number))
        {
            System.out.println(number+" number is prime number");
        }
        else
        {
            System.out.println(number+"not prime number");
        }
    }

        private static boolean isPrime(int n)
        {
            if(n<=1)
            {
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }

            }
            return true;

        }

}
