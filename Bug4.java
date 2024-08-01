import java.util.Scanner;
public class Bug4{
  public static void main(String[] args) {
    int temp=1;
Scanner in=new Scanner(System.in);
System.out.println("enter the value");
int a=in.nextInt();
for(int i=1;i<=a;i++) {
temp=temp*i;	
  // Fix the Bugs and Issues
}
System.out.println("factorial:"+temp);
}
}
