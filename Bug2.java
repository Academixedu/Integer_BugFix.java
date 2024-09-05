import java.util.Scanner;

public class Bug2{
	public class Fibonacci {
	public void scan() {
		int a,b,c;	
		Scanner in=new Scanner(System.in);
		System.out.println("Give Your Number");
		a=in.nextInt();
		System.out.println("Give Sequential Number");
		b=in.nextInt();
		System.out.println("Give Your Count");
		c=in.nextInt();
		System.out.println("First Number"+a);
		System.out.println("Second Number"+b);
		System.out.println(a+""+b);
	for(int e=2;e<c;e++) {
	c=a+b;
	System.out.print("," +c);
	a=b;
	b=c;
	}
}
	}
	
	  // Fix the Bug Issues and Erros and Solve Them
		public static void main(String[] args) {
			
			Bug2.Fibonacci f=new Bug2().new Fibonacci();
	f.scan();		
	
	
	}
	}
