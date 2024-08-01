import java.util.Scanner;

public class Bug4
{

  public static void main(String[] args) 
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number that you want to factorial :");
    int temp=1;
    int a=in.nextInt();
    while(a!=0)
    {
    temp=temp*a;	
    a--;
      // Fix the Bugs and Issues
    }
    System.out.println("factorial:"+temp);
    in.close();
      
  }

}