import java.util.Scanner;

public class Bug3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = in.nextInt();
        int temp = 0;
        int pal = a;

        // Reverse the number
        while (a != 0) {
            int rem = a % 10;  // Get the last digit
            temp = temp * 10 + rem;  // Build the reversed number
            a = a / 10;  // Remove the last digit
        }

        // Check if the original number and reversed number are the same
        if (pal == temp) {
            System.out.println("Palindrome: " + temp);
        } else {
            System.out.println("Not a palindrome. Reversed number: " + temp);
        }
    }
}
