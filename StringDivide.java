package stringPrograms;

public class StringDivide {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        int n = 3;
        int len = str.length();
        int chars = len/n;
        int temp = 0;
        String[] equals = new  String[n];
        if (len % n != 0)
        {
            System.out.println("String cant be divided");
        }
        else
        {
            for (int i = 0; i < len; i = i + chars)
            {
                 String part = str.substring(i, i +chars);
                 equals[temp] = part;
                 temp++;
            }
            System.out.println(n + " equal parts of given string are ");
            for(int i = 0; i < equals.length; i++) {
                System.out.println(equals[i]);
            }
        }
    }
}
