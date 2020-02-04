public class EvenPosition {
    public static void main(String[] args) {
        int arr[] = new int[]{5,7,9,10,7,8,9,11,17};
        System.out.print("Even Position Elements: ");
        for (int i = 1; i < arr.length;i = i + 2)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Odd Position Elements: ");
        for (int i = 0; i < arr.length;i = i + 2)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
