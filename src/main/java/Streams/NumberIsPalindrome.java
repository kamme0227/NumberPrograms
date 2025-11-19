package Streams;

import java.util.Scanner;

public class NumberIsPalindrome {
    public static void main(String[] args)
    {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int input=sc.nextInt();
//
//        int number=input;
//        int reverseNumber=0;
//
//        while(number!=0)
//        {
//            int digit=number%10;
//            reverseNumber=reverseNumber*10+digit;
//            number=number/10;
//        }
//        if(number==reverseNumber)
//        {
//            System.out.println(number+"Number is palidrome");
//        }
//        else
//        {
//            System.out.println("not Palidrome");
//        }

        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        String reverse=new StringBuilder(num).reverse().toString();
        if(num.equals(reverse))
        {
            System.out.println("String is not a palidrome");
        }
        else
        {
            System.out.println("String is not a palidrome");
        }
    }
}
