import java.util.*;
class factors
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = ob.nextInt(),i;
        for(i=1;i<=n;i++)
         if(n%i==0) 
        System.out.println("The factors of the number are"+i);
    }
}