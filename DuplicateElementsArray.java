public class DuplicateElementsArray {
    public static void main(String[] args) {
        int arr[] = new int[]{4,8,9,4,6,3,2,9};
        for (int i = 0; i <arr.length; i++)
        {
            for (int j = i + 1; j < arr.length;j++)
            {
               if (arr[i] == arr[j])
               {
                   System.out.println(arr[j]);
               }
            }
        }
    }
}
