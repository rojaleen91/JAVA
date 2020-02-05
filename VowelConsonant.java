package stringPrograms;

public class VowelConsonant {
    public static void main(String[] args) {
        int vCount = 0;
        int cCount = 0;
        String s = "My Name is Rojaleen";
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                vCount++;
            }
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
