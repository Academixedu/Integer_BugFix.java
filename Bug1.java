 import java.util.Scanner;
public class Bug1{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Number");

	int temp=0;
	int a=in.nextInt();
	for(int i=1;i<a;i++) 
	{
		if(a%i==0) {
			a=a+i;
			temp=temp+i;
			System.out.println(i);
		}

	}
	if(i==a) {
		// Fix the Bug and Print Perfect Number or Not
		if(temp==a) {
			System.out.println("Perfect Number"+temp);
        }
		else {
			System.out.println("not a perfecrt");
        }
	}
}
}
