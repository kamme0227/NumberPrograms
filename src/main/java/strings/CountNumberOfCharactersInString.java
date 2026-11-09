package strings;

public class CountNumberOfCharactersInString {
    public static void main(String[] args)
    {
        String s="suresh";
        int count=0;
        for(char ch:s.toCharArray())
        {
         count++;
        }
        System.out.println(count);
    }
}
