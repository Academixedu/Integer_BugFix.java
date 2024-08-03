import java.util.Scanner;
public class Bug3{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
@@ -6,9 +7,9 @@ public static void main(String[] args) {
	int temp=0;
	int pal=a;
while(a!=0) {
	int rem=a/10;
	temp=temp/10+rem;
	a=a%10;
	int rem=a%10;
	temp=temp*10+rem;
	a=a/10;
}
if(pal==temp) {
System.out.println("Palindrome------"+temp);	
