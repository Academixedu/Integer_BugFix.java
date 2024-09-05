import java.util.Scanner;

public class Bug1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number");

        int a = in.nextInt();  // The input number
        int sum = 0;  // To store the sum of divisors

        // Loop to find divisors of the number
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;  // Add divisor to sum
                System.out.println("Divisor: " + i);
            }
        }

        // Check if the sum of divisors equals the original number
        if (sum == a) {
            System.out.println(a + " is a Perfect Number");
        } else {
            System.out.println(a + " is not a Perfect Number");
        }
    }
}
