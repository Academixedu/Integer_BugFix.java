import java.util.Scanner;

public class Bug4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int temp = 1;
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            temp *= i;
        }
        System.out.println("Factorial of Number : " + temp);
    }
}
