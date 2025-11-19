package Streams;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveOccuerenceOfCharacter {

//    public static void main(String[] args) {
//        String str = "java interview";
//        char ch = 'a';
//        String result = removeCharacter(str, ch);
//        System.out.println(result);
//    }
//
//        public static String removeCharacter(String str, char ch)
//        {
//            if(str==null || str.isEmpty())
//            {
//                return str;
//            }
//            String result=str.chars().filter(c->c!=ch).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
//
//            return result;
//        }


    public static void main(String[] args)
    {
//        String input = "Hello, World! 123 #Java$Stream";
//
//        List<Character> specialChar=input.chars().mapToObj(c->(char)c).filter(c->!Character.isLetterOrDigit(c))
//               .collect(Collectors.toList());
//        System.out.println(specialChar);

        List<Integer> list= Arrays.asList(12,11,14,66,77,88,99,14,16);

        List<Integer> numberStartingOne=list.stream().filter(num->String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(numberStartingOne);

                    }
}
