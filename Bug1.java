import java.util.Scanner;

public class Bug1{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Number");
	
	int a=in.nextInt();
    int num=0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			num=num+i;
			
		}
		
	}
	if(a==num) {
		System.out.println("Perfect Number :"+a);
		
		
	}
	else{
		System.out.println("not a perfect number");
	}
	
// Fix the Bug and Print Perfect Number or Not
}
}
