package stringPrograms;

public class AllSubsets {
    public static void main(String[] args) {
        String s = "FUN";
        int temp = 0;
        int len = s.length();
        String arr[] = new String[len*(len+1)/2];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i; j < s.length(); j++)
            {
                arr[temp] = s.substring(i, j+1);
                temp++;
            }
        }
        //This loop prints all the subsets formed from the string.
        System.out.println("All subsets for given string are: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
