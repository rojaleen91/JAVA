public class SmallestElementArray {
    public static void main(String[] args) {
        int arr[] = new int[]{20,78,67,89,90};
        int smmallest = arr[0];
        for (int i = 1; i <arr.length;i++)
        {
            if (arr[i] < smmallest)
            {
                smmallest = arr[i];
            }

        }
        System.out.print("Largezt no is : "+smmallest);

    }
}

