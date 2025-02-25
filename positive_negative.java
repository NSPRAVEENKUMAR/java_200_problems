import java.util.*;

public class positive_negative {
    //  check positive or negative
    public static void positive_negative(int a) {
        if(a > 0) {
            System.out.println("The number is positive");
        } else if(a < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Take input from user
        positive_negative(a); // Call the method with the variable 'a'
    }
}
