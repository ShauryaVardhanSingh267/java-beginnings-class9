import java.util.*;
class a5
{
    public static void main (String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter the number");
        int a = ob.nextInt();
        System.out.println("Enter the limit ");
        int b = ob.nextInt(),i,p=1;
        for(i=1;i<=b;i++)
        {
        p=a*i;
        System.out.println(a+"*"+i+"="+p);
        }
    }
}