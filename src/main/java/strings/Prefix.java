package strings;

public class Prefix {

    public static String commonPrefix(String[] arr)
    {
        String prefix=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            while(!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
    public static void main(String[] args)
    {
        String[] arr={"flower","flow","flight"};
        System.out.println(commonPrefix(arr));
    }
}
