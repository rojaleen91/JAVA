public class sumOfElementArray {
    public static void main(String[] args) {
        int arr[] = new int[]{2,7,8,6};
        int sum = 0;
        for (int i = 0; i< arr.length;i++)
        {
            sum = sum +arr[i];
        }
        System.out.print("Sum of elements in Array : "+sum);
    }
}
