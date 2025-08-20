import java.util.*;
class prac7
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a numbers");
        double a= ob.nextDouble();
        System.out.println("Enter 1 for the Square of the digit \n Enter 2 for Square root of the digit \n Enter 3 for rounding off the digit \n Enter 4 for a random value");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1 : 
                System.out.println("The square of the digit is -->"+ Math.pow(a,2));
                break;
                case 2 :
                    System.out.println("The Square root of the digit is -->"+(Math.sqrt(a)));
                    break;
                    case 3 :
                        System.out.println("The round off of the digit is -->"+(Math.round(a)));
                        break;
                        case 4 :
                            System.out.println("Random value is -->"+(Math.random()));
                            break;
                            default :
                                System.out.println("Invalid input");
                                break;
        }
    }
}