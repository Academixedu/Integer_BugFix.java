import java.util.Scanner;
public class Bug1{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Number");
	
	int a=in.nextInt();
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			a=a+i;
			System.out.println(i);
		}
		
	}
	if(a==a) {
		System.out.println("Perfect Number"+a);
	}
// Fix the Bug and Print Perfect Number or Not
}
}
