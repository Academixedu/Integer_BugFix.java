
import java.util.Scanner;
public class Bug1{
public static void main(String[] args) {
	int b=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Number");
	
	int a=in.nextInt();
	
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			b=b+i;
			System.out.println(b);
		}
		
	}
	if(a==b) {
		System.out.println("Perfect Number"+a);
	}
	else{
		System.out.println(" not Perfect Number"+a);
	}
// Fix the Bug and Print Perfect Number or Not
}
}
