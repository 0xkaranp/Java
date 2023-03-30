import java.util.*;

public class vote 
{
   public static int vote(int vo)
   {
    System.out.print(vo);
    return vo;
   }
   public static void main(String[]args)
   {
    System.out.println("Enter your age");
    Scanner sc = new Scanner(System.in);
    int vo = sc.nextInt();

    if(vo>=18)
    {
        System.out.println("You can vote");
    }
    else{
        System.out.println("You cannot vote");
    }

   }    
}
