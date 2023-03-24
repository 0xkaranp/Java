import java.util.*;

public class Main
{
	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.print("Enter rows\n");
	 int a=sc.nextInt();
	 System.out.print("Enter coloumn\n");
	 int b=sc.nextInt();
	 
	 for(int i=1;i<=a;i++)
	 {
	     for(int j=1; j<=b; j++)
	     {
	         System.out.print("*");
	     }
	     System.out.println();
	 }
	 
  }
}