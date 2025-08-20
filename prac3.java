import java.util.*;
class prac3
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a buzz number");
        int a = ob.nextInt();
        if(a%7==0 || a%10==7)
        System.out.println("It is a Buzz Number");
        else
        System.out.println("It is not a Buzz Number");
    }
}