import java.util.*;
class pallindrome
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check if it ia a palindrome number");
        int a= ob.nextInt(),d=0,b=a,n=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            n=n*10+d;
            System.out.print(n);
        }
        if(n==b)
        System.out.println("Pallindrome number" );
        else
        System.out.println("Not an pallindrome number" );
    }
}