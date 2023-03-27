import java.util.*;
  
public class greter{
    
    public static int greater(int gret)
    {
        System.out.print(gret);
        return gret;
    }
    public static void main(String[]args)
    {
        System.out.print("Enter  numbers\n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a>b)
        {
            System.out.println("a is greater");
        }
        else{
            System.out.print("B is greater");
        }
        
       
    }
}
