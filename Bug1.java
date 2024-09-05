import java.util.Scanner;

public class Bug1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number");
        
        int number = in.nextInt();
        int sum = 0;

        // Iterate through possible divisors from 1 to number-1
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to sum
                System.out.println(i); // Print the divisor
            }
        }
        
        // Check if the sum of divisors is equal to the original number
        if (sum == number) {
            System.out.println("Perfect Number: " + number);
        } else {
            System.out.println("Not a Perfect Number");
        }
        
        in.close();
    }
}

