import java.util.*;
class prac11
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a,d=0,b=0,c;
        do
        {
            System.out.println("Enter a number \n or \n 0 to exit");
            a = ob.nextInt();
            c=a;
            while(a>0)
            {
                d=a%10;
                a=a/10;
                if(c%d == 0)
                b++;
             }
            if(c==2)
            System.out.println("Prime Number");
            else
            System.out.println("Prime Number");
        }
        while(a!=0);
    }
}