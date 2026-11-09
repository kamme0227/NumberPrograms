package strings;

public class CountAllCharacter {
    public static void main(String[] args)
    {
        String input="Suresh$$123";
        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;
        int special = 0;

        for(char ch:input.toCharArray())
        {

            if (ch >= 'A' && ch <= 'Z') {
                uppercase++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                lowercase++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else {
                special++;
            }
        }

        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);
    }
}

