import java.util.*;
public class twodarrays {
    public static void main(String[]args)
    {
        System.out.println("Enter rows and coloumn ");
        Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        int coloumn=sc.nextInt();
        System.out.println("ENter your elements");
        int [][]Array = new int[row][coloumn];

        //Input
        for(int i=0; i<row; i++)
        
        {
            for(int j=0; j<coloumn; j++)
            

            {   
                Array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Your searching number");
        int x=sc.nextInt();
        //comparing
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                if(Array[i][j]==x)
                {
                    System.out.println("Search found at location("+i+", "+j+")");
                }
               
            }
        }
    }
}
