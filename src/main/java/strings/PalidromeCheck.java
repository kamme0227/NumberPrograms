package strings;

public class PalidromeCheck {

    public static boolean isPalidrome(String input)
    {
        int left=0;
        int right=input.length()-1;
        while (right>left)
        {
            if(input.charAt(left)!=input.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s="adam";
        System.out.println(isPalidrome(s));
    }
}
