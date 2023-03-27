import java.util.*;

public class radius
{
    public static int radius(int rad)
    {
        System.out.print(rad);
        return rad;
    }
    public static void main(String[]args)
    {
        System.out.println("Enter the radius");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int pi = 3;
        int rad = 2*pi*a;

        radius(rad);

    }
}