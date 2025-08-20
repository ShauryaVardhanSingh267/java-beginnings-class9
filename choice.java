import java.util.*;
class choice
{
   public static void main (String args[]) 
   {
       Scanner ob = new Scanner (System .in);
       System.out.println("Enter a number");
       int a = ob.nextInt();
       System.out.println("Enter 1 for squaring the number , 2 for finding square root , 3 for rounding off and 4 for random value");
       int choice = ob.nextInt();
       switch(choice)
       {
           case 1 :
               System.out.println("The square is "+(Math.pow(a,2)));
               break;
               case 2:
                   System.out.println("The square root is"+(Math.sqrt(a)));
                   break;
                   case 3:
                       System.out.println("The rounded off value is "+(Math.round(a)));
                       break;
                       case 4:
                           System.out.println("The random value is "+(Math.random()));
                           break;
                           default:
                               System.out.println("Invalid input");
                   
       }
   }
}
