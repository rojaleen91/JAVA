import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class SwitchExample {
    public static void main(String[] args) {
        int age = 20;
        switch (age){
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
            case 30:
                System.out.println(30);
                break;
            default:
                System.out.println(40);
        }
    }
}
