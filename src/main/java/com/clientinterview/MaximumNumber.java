package com.clientinterview;

public class MaximumNumber {
     public static void main(String[] args) {
         int[] numbers={4,9,2,7,5};
         int max=Integer.MIN_VALUE;
         for(int i=0;i<numbers.length;i++){
             if(numbers[i]>max){
                 max=numbers[i];
             }
         }
         System.out.println(max);
     }
}
