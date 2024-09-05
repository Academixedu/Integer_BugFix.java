import java.util.*;
public class Bug3{
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
        System.out.println("Enter");
        int a = in.nextInt();
        int pal = a;
        int rev = 0, rem;
        while (a != 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        if (rev == pal) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
	}
}
