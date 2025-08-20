import java.util.*;
class sc1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter a number");
        int a = ob.nextInt(),d=0,c=0;
        while(a>0)
        {
        d = a%10;
        a = a/10;
        if(d%2==0)
        {
        c=c+1;
        System.out.println("The even digits are"+d);
        }
        }
        if(c==0)
        System.out.println("No even digits");
        }
}