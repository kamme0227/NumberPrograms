package org.example;//package org.example;

public class FibonacciSeries {

    public static void main(String[] args)
    {
        int a=0;
        int b=1;
        int next ;
        int n=10;

        for(int i=1;i<=n;i++)
        {
                next = a + b;
                a=b ;
                b = next;
            System.out.println(a+" ");
        }

    }
}

//public class FibonacciExample {
//    public static void main(String[] args) {
//        int n = 10; // print first 10 numbers
//        int a = 0, b = 1;
//
//        System.out.print("Fibonacci Series: ");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " "); // print current number
//            int next = a + b;  // calculate next number
//            a = b;             // shift b to a
//            b = next;          // next becomes b
//        }
//    }
//}
