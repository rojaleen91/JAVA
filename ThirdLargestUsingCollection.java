import java.util.*;

public class ThirdLargestUsingCollection {
    public static int getThirdLargest(Integer[] a, int total) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total - 3);
        return element;

    }

    public static void main(String[] args) {
        Integer a[] = {3, 5, 8, 2, 8, 9};
        System.out.println("Third Largest: " + getThirdLargest(a,5));
    }
}