import java.util.Scanner;

public class Bug1{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Number");
	
	int a=in.nextInt();
	int b=0;
	for(int i=1;i<=a/2;i++) {
		if(a%i==0) {
			 b=b+i;
			
			
		}
		
	}
	if(b==a) {
		System.out.println("Perfect Number"+a);
	}
// Fix the Bug and Print Perfect Number or Not
}
}
