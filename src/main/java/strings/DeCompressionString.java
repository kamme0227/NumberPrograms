package strings;

public class DeCompressionString {
    public static void main(String[] args)
    {
        String str="2a3b4c";
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i+=2)
        {
            int count=Character.getNumericValue(str.charAt(i));
            char ch=str.charAt(i+1);
            result.append(String.valueOf(ch).repeat(count));
        }
        System.out.print(result.toString());
    }
}
