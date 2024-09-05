import java.util.*;

public class Bug2 {
    public void scan() {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Give Your Number");
        a = in.nextInt();
        System.out.println("Give Sequential Number");
        b = in.nextInt();
        System.out.println("Give Your Count :");
        d = in.nextInt();
        System.out.println("First Number :" + a);
        System.out.println("Second Number :" + b);
        for (int i = 0; i < d; i++) {
            c = a + b;
            System.out.println("Next Number :" + c);
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Bug2 bug2 = new Bug2();
        bug2.scan();

    }
}
