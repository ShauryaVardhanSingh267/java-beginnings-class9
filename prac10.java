import java.util.*;
class prac10
{
    public static void main(String args [])
    {
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter a number and check the frequency of the number");
        int a = ob.nextInt(),d,c=0,n=a,r=0;
        while(a>0)
        {
            d=a%10;
            c++;
            a=a/10;
        }
        System.out.println("The frequency of the number is "+c);
    }
}