import java.util.*;
public class Bug4{
  public static void main(String[] args) {
    System.out.println("enter ");
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int temp = 1;
for(int i=1;i<=a;i++) {
temp=temp*i;	
  // Fix the Bugs and Issues
}
System.out.println("factorial:"+temp);
}
}
