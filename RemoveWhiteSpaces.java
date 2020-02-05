package stringPrograms;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s1 = "My Name is Rojaleen";
        String str2 = s1.replaceAll("\\s",",");
        System.out.println("String after removing all the white spaces : " + str2);
    }
}
