import java.util.*;
public class Bug1{
public static void main(String[] args) {
	int temp = 0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Number");
	
	int a=in.nextInt();
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			temp = temp+i;
			System.out.println(i);
		}
		
	}
	if(a == temp ) {
		System.out.println("Perfect Number"+a);
	}
	else{
		System.out.println("not a perfect number");
	}
// Fix the Bug and Print Perfect Number or Not
}
}
