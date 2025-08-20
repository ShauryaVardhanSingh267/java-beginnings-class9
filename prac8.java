import java.util.*;
class prac8
{
    public static void main(String args [])
    {
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter a number to check if it is a pallindrome number or not");
        int a = ob.nextInt(),d,s=0,n=a,r=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            r=r*10+d;
        }
        if(n==r)
        System.out.println("Pallindrome Number");
        else
        System.out.println("Not a Pallindrome Number");
    }
}
