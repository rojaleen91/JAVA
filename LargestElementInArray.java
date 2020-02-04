public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{20,78,67,89,90};
        int temp = 0;
        int largest = arr[0];
        for (int i = 1; i <arr.length;i++)
        {
            if (arr[i] > largest)
            {
                largest = arr[i];
            }

        }
        System.out.print("Largezt no is : "+largest);

    }
}
