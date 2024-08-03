import java.util.Scanner;
public class Bug2{
public class Fibonacci {
public void scan() {
	int a,b,c,d;	
	Scanner in=new Scanner(System.in);
@@ -12,15 +12,15 @@ public void scan() {
	System.out.println("First Number"+a);
	System.out.println("Second Number"+b);
for(int e=0;e<d;e++) {
d=a+b;
c=a+b;
System.out.print(c+",");
c=b;
a=c;
a=b;
b=c;
}
}	
  // Fix the Bug Issues and Erros and Solve Them
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		Bug2 f=new Bug2();
f.scan();		
