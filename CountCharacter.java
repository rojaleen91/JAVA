package stringPrograms;

public class CountCharacter {
    public static void main(String[] args) {
        int count = 0;
        String s = "Selenium is a Automation Tool";
        for (int i = 0; i <= s.length() - 1; i++)
        {
            if (s.charAt(i) != ' ')
            {
                count++;
            }
        }
        System.out.println("No of Character in a string is  : "+count);
    }
}
