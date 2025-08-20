import java.util.*;
class sc3
{
    public static void main(String args[])
    {
    Scanner ob = new Scanner (System.in);
    System.out.println("Enter a number");
    int a = ob.nextInt(),d=0,n=a,s=0;
        while(a>0)
    {
        d = a%10;
        a = a/10;
        s=s+d*d*d;
    }
    if(n==s)
    System.out.println("Armstrong number");
    else
    System.out.println("Not an Armstrong number");
    }
}