import java.util.*;
class sc2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter a number");
        int a = ob.nextInt(),d=0,n=0;
        while(a>0)
    {
        d = a%10;
        a = a/10;
        n=n+d;
    }
    System.out.println("The sum of the digits is \t"+n);
    }
}
