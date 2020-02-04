import java.util.Scanner;

public class PrimeNoWithUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check prime");
        int no = sc.nextInt(), flag = 0;
        for(int i = 2; i <= no - 1; i++)
        {
            if (no % i == 0 )
            {
                flag = flag + 1;
            }
        }
        if (flag == 0)
        {
            System.out.println("prime");
        }
        else
            System.out.println("not prime");


    }
}
