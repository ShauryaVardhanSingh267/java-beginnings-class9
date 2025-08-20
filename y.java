//Disarium number is a number that is equal to the sum of digits raised to the power of their position.135=1^1+3^2+5^3
import java.util.*;
class y
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter a number ");
        int a = ob.nextInt(),copy=a,d=0,count=0,sum=0;
        while(a>0)
        {
            count++;
            a=a/10;
        }
        a=copy;
        while(a>0)
        {
          d=a%10;
          sum = sum+(int)(Math.pow(d,count));
          a=a/10;
          count--;
        }
        if(sum==copy)
        System.out.println("The number is a Disarium Number");
        else
        System.out.println("The number is not a Disarium Number");
        }
    }
