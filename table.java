import java.util.*;
class table 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter a limit");
        int a = ob.nextInt();
        double s = 0;
        for(int i = 1;i<=a;i= i+1)
        {
            s = s + i/(i + 1.0);
        }
        System.out.println("The sum is"+s);
    }
}