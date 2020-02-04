import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check Palindrome : ");
        int no = sc.nextInt(), sum = 0, temp,r;
        temp = no ;
        while(no > 0)
        {
            r = no % 10;
            sum = (sum * 10) + r;
            no = no / 10;
        }
        if (temp == sum)
        {
            System.out.println("palindrome no");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
