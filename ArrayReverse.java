public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = new int[]{4,7,9,6,3,9};
        int rev[] = {};
        for (int i = 0; i <arr.length;i++)
        {
            System.out.print(arr[i]+"");
        }
        System.out.println();
        for (int i = arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+"");
        }
    }
}
