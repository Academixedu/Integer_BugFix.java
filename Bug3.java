import java.util.Scanner;

public class Bug3{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
System.out.println("Enter");
	int a=in.nextInt();
	int temp=0;
	int pal=a;
while(a!=0) {
	int rem=a/10;
	temp=temp*10+rem;
	a=a/10;
}
if(temp==pal) {
System.out.println("Palindrome------"+temp);	
}
else 
{
System.out.println("Reverse----"+temp);
	// Fix the Issue and Check Palindrome or not
}
	}
}
