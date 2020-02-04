import java.util.Scanner;

public class FactorialNumberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No : ");
        int no = sc.nextInt(), fact = 1;
        for (int i = 2; i <= no; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of "+no+" "+"is"+" " +fact);
    }
}
