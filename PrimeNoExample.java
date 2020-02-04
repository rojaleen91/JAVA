public class PrimeNoExample {
    public static void main(String[] args) {
        int no = 7, flag = 0;
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
