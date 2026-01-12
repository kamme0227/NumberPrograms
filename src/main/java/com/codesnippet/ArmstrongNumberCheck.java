package com.codesnippet;

public class ArmstrongNumberCheck {

    public static void main(String[] args)
    {
//        int number=153;
//        if(isArmstrongNumber(number))
//        {
//            System.out.println(number+"amstrongnumber");
//        }
//    }
//    private static boolean isArmstrongNumber(int n)
//    {
//        int sum=0;
//        int digits=String.valueOf(n).length();
//        int original=n;
//
//        while (n>0)
//        {
//            int digit=n%10;
//            sum+=Math.pow(digit,digits);
//            n=n/10;
//
//        }
//        return sum==original;

        int num=133;

        int original=num;
        int sum=0;
        int digits=String.valueOf(num).length();
        while (num>0)
        {
            int digit=num%10;
            sum+=Math.pow(digit,digits);
            num=num/10;
        }
        if(sum==original)
        {
            System.out.println("armstrong number");
        }
    }
}
