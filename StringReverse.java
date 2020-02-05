package stringPrograms;

public class StringReverse {
    public static void main(String[] args) {
        String string = "Dream big";
        String reversedStr = "";
        for(int i = string.length()-1; i >= 0; i--){
            reversedStr = reversedStr + string.charAt(i);
        }
        System.out.println("Original string: " + string);
        //Displays the reverse of given string
        System.out.println("Reverse of given string: " + reversedStr);
        if (reversedStr.equals(string))
        {
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}
