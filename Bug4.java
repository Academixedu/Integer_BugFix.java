import java.util.Scanner;

public class Bug4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = in.nextInt();

        int temp = 1;

        // Corrected loop to calculate factorial
        for (int i = 1; i <= a; i++) {
            temp = temp * i;
        }

        System.out.println("Factorial: " + temp);
    }
}