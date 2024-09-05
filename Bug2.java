import java.util.Scanner;

public class Bug2 {
    
    public static class Fibonacci {
        public void scan() {
            Scanner in = new Scanner(System.in);
            System.out.println("Give Your First Number:");
            int a = in.nextInt();  // First number
            System.out.println("Give Your Second Number:");
            int b = in.nextInt();  // Second number
            System.out.println("Give Your Count:");
            int count = in.nextInt();  
            
            System.out.println("First Number: " + a);
            System.out.println("Second Number: " + b);
            
            System.out.print(a + ", " + b);
            
            for (int i = 2; i < count; i++) {
                int c = a + b;  
                System.out.print(", " + c);
                a = b;  
                b = c;  
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.scan();  
    }
}
