package com.codesnippet;

public class  ArmstrongNumberCheck {

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

        int num=153;
        int original=num;
        int sum=0;
        while(num>0)
        {
            int d=num%10;
            sum=sum+(d*d*d);
            num=num/10;
        }
        if(original==sum)
        {
            System.out.println("Amstrong Number");
        }
        else
        {
            System.out.println("not a amstrong number");
        }
    }
}
