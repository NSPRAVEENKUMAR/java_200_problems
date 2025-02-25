import java.util.*;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        sc.close();

        if (a <= 1) {
            System.out.println("The number is not a prime number");
            return;
        }

        boolean is_prime = true;

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                is_prime = false;
                break;
            }
        }

        if (is_prime) {
            System.out.println("The number is a prime number");
        } else {
            System.out.println("The number is not a prime number");
        }
    }
}
