
import java.util.Scanner;

public class Bug2{
public void Fibonacci (){
     int a,b,c,d;	
	Scanner in=new Scanner(System.in);
	System.out.println("Give Your Number");
	a=in.nextInt();
	System.out.println("Give Sequential Number");
	b=in.nextInt();
	System.out.println("Give Your Count");
	d=in.nextInt();
	System.out.println("First Number: "+a);
	System.out.println("Second Number: "+b);
for(int i=0;i<d;i++) {
c=a+b;
System.out.print(c+",");
a=b;
b=c;
}
}
public static void main(String[] args) {
	new Bug2().Fibonacci();

}


  // Fix the Bug Issues and Erros and Solve Them
	

}


