import java.util.*;
class prac6
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a= ob.nextInt();
        int b= ob.nextInt();
        System.out.println("Enter 1 for the sum of digits \n Enter 2 for difference of the digits \n Enter 3 for the product of digits \n Enter 4 for the quotient of the digits");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1 : 
                System.out.println("The sum of the digits is -->"+(a+b));
                break;
                case 2 :
                    System.out.println("The difference of the digits is -->"+(Math.abs(a-b)));
                    break;
                    case 3 :
                        System.out.println("The product of the digits is -->"+(a*b));
                        break;
                        case 4 :
                            System.out.println("The quotient of the digits is -->"+(a/b));
                            break;
                            default :
                                System.out.println("Invalid input");
                                break;
        }
    }
}