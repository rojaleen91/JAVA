public class BubbleSorting {
     static int arr[] = {3, 5 ,67, 21,85,2, 56};
    static int l = arr.length , temp;
    static void bubblesort(int arr[]){
        for (int i = 0; i < l ; i++)
        {
            for (int j = 1 ; j < i ; j++)
            {
                if (arr[j - 1] > arr[j])
                {
                  temp  = arr[j-1];
                  arr[j-1] = arr[j];
                  arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i <arr.length ;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubblesort(arr);
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i <arr.length ;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
