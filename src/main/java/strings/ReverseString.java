package strings;

public class ReverseString {

    public static String reversStr(String input)
    {
        char[] arr=input.toCharArray();
        int left=0;
        int right=input.length()-1;
        while (left<right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String rev=new String(arr);
        return rev;
    }
    public static void main(String[] args)
    {
        String input="suresh";
        System.out.println(reversStr(input));
    }
}
