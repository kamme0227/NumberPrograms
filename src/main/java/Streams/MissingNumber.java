package Streams;

public class MissingNumber {

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int n=5;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;

        for(int sum:arr) {
            actualSum += sum;

        }
        int missingNum=expectedSum-actualSum;
        System.out.println("missingNumberb"+missingNum);

    }
}
