import java.util.Scanner;
public class Bug4{
  public static void main(String args[]){

  
Scanner in=new Scanner(System.in);
int temp=1;
    System.out.println("enter a : ");
   int a=in.nextInt();
for(int i=1;i<=a;i++) {
temp=temp*i;	
  // Fix the Bugs and Issues
}
System.out.println("factorial:"+temp);
}
}
