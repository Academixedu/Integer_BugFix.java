import java.util.Scanner;

public class Bug2 {


    public static class Fibonacci {
        public void scan() {
            int a, b, c, count;
            Scanner in = new Scanner(System.in);

            // Get the starting numbers and count
            System.out.println("Give Your First Number");
            a = in.nextInt();
            System.out.println("Give Sequential Number");
            b = in.nextInt();
            System.out.println("Give Your Count");
            count = in.nextInt();

            // Print the first two numbers
            System.out.println("First Number: " + a);
            System.out.println("Second Number: " + b);

            // Print the Fibonacci sequence up to 'count' numbers
            System.out.print(a + ", " + b);  // Print the first two numbers
            for (int i = 2; i < count; i++) {  // Start from 2 since we already printed two numbers
                c = a + b;  // Calculate next Fibonacci number
                System.out.print(", " + c);  // Print the next Fibonacci number
                a = b;  // Shift a to b
                b = c;  // Shift b to c
            }
            System.out.println();  // Newline after the sequence
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.scan();
    }
}