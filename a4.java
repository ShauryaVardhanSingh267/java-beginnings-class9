import java.util.*;
class a4
{
    public static void main(String args [])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        double a = ob.nextDouble();
        System.out.println("Enter a to know if the number is even or odd , b to print the sum of the first ten natural numbers ");
        char choice = ob.next().charAt(0);
        int s = 0;
        switch(choice)
        {
            case 'a' : 
                {if(a%2==0)
                System.out.println("Even");
                else
                System.out.println("Odd");
                }
                break;
                case 'b' :
                    for(int i=1;i<=10;i++)
                    s=s+i;
                    System.out.println("The sum is "+ s);
                    break;
                    default :
                         System.out.println("Invalid input");
                         break;
        }
    }
}