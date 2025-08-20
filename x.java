import java.util.*;
class x
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter the number of which you want a table");
        int i = ob.nextInt();
        System.out.println("Enter the limit of the table");
        int n = ob.nextInt();
        int a=1,c=i,s=1;
        for(a=1;a<=n;a++)
        {
            s=c;
            s=s*a;
            System.out.println(i+" * "+a+" = "+s);
        }
    }
}