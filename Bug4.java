import java.util.Scanner;
public class Bug4{
  public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int temp=1;
System.out.print("Enter the value:");
int a=in.nextInt();

for(int i=a;i!=0;i--) {
temp=temp*i;	
  // Fix the Bugs and Issues
}

  System.out.println("factorial:"+temp);
}
}


