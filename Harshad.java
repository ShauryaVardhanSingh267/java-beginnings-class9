//a number is equal to the sum of factorial of it's digits. Harshad number.
import java.util.*;
class Harshad
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter a number ");
        int a = ob.nextInt(),copy=a,d=0,sum=0,p=1;
        while(a>0)//245    24   
        {
            d=a%10;//5   4
            p=1;
            for(int i = 1;i<=d;i++)
            p=p*i;//1*2*3*4*5 =120
            sum=sum+p;//0+120
            a=a/10;//24
        }
        if(copy==sum)
        System.out.println("it is a Harshad number ");
        else
        System.out.println("it is not a Harshad number ");
    }
}

        
