import java.util.*;
class a7
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner (System.in);
        System.out.println("Enter the limit");
        int a = ob.nextInt();
        System.out.println("Enter the limit");
        int x = ob.nextInt();
        int i ;
        double s=15.0;
        for(i=1;i<=x;i++)
        s=s+Math.pow(a,i);
        System.out.print(s);
    }
}