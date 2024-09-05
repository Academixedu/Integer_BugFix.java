import java.util.Scanner;

public class Bug2 {
	public class Fibonacci {
		public void scan() {
			int a, b, c, d;
			Scanner in = new Scanner(System.in);

			System.out.println("Give Your First Number:");
			a = in.nextInt();

			System.out.println("Give Your Second Number:");
			b = in.nextInt();

			System.out.println("Give Your Count:");
			d = in.nextInt();

			System.out.println("First Number: " + a);
			System.out.println("Second Number: " + b);

			for (int e = 2; e < d; e++) {
				c = a + b;
				System.out.print(c + ", ");
				a = b;
				b = c;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Bug2.Fibonacci f = new Bug2().new Fibonacci();
		f.scan();
	}
}
