import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
      Scanner ob = new Scanner(System.in);
      System.out.println("Enter a number to check if it is a fibonacci number");
      int n = ob.nextInt(),a=0,b=1,c;
      for(int i =1;i>0;i++)
      {
         c=a+b;
         if(a==n)
         {
         System.out.println("Fibonacci Number");
         break;
        }
        a=b;
        b=c;
      }
      if(a!=n)
      System.out.println("Not a Fibonacci number");
    }
}