import java.util.Scanner;

public class Bug3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = in.nextInt();  
        
        int original = a;  
        int reversed = 0;  
        
        while (a != 0) {
            int rem = a % 10;  
            reversed = reversed * 10 + rem;  
            a = a / 10;  
        }
        
        if (original == reversed) {
            System.out.println("Palindrome: " + reversed);
        } else {
            System.out.println("Reverse: " + reversed);
        }
        
        in.close();  
    }
}
