public class FibonacciSriesWithReursion {
    static int n1 = 0, n2 = 1,n3, count = 10;
    static void fibonaccciwithRecursion(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonaccciwithRecursion(count - 1);

        }
    }
    public static void main(String[] args) {

        System.out.print(n1+" "+n2);
        fibonaccciwithRecursion(count-2);
    }
}
