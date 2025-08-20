import java.util.*;
class a9
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int d=0,s=0,a;
        
        do
        {
            System.out.println("Enter a number or 0 to exit");
            a = ob.nextInt();
            d=a%10;
            a=a/10;
            s=s+d;
        }
        while(a>0);
        System.out.println(s);
        
    }
}