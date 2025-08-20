import java.util.*;
class a8
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit");
        int a = ob.nextInt(),i,s=0;
        for(i=1;i<=a;i++)
        {
            if(i%2==0)
            s=s-i;
            else
            s=s+i;
        }
        System.out.println("The sum is"+s);
    }
}