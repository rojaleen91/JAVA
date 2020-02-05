package stringPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        /*Two Strings are called the anagram if they contain the same characters.
        However, the order or sequence of the characters can be different.*/

        String str1="Brag";
        String str2="Grab";

        //converting tolowercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Checking the length of string

        if (str1.length() != str2.length())
        {
            System.out.println("Strings are not anagram");
        }
        else
        {
            //converting string to character array

            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            //sort both arrays

            Arrays.sort(string1);
            Arrays.sort(string2);
            if (Arrays.equals(string1,string2))
            {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}
