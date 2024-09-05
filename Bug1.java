import java.util.*;
public class Bug1{
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number");
        int sum = 0;
        int a = in.nextInt();
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }

        }
        if (sum == a) {
            System.out.println("Perfect Number:: " + a);
        } else {
            System.out.println("Not a Perfect Number:: " + a);
        }
}
}
