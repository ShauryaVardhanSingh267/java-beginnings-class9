import java.util.*;
class prime1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n=1,c;
        do
        {
        System.out.println("Enter a number");
        System.out.println("Enter 0 to exit");
        n=sc.nextInt();
        c=0;
        for(i=1;i<=n;i++)
        {
        if(n%i==0)
        c=c+1;
        }
        if(c==2)
        System.out.println("Prime Number");
        else
        System.out.println("not a Prime Number");
        }
        while(n!=0);
    }
}