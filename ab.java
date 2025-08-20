import java.util.*;
class ab
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any two numbers ");
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.println("Enter 1 for sum \n"+" 2 for product \n"+" 3 for difference \n"+" 4 for quotient \n"+" 5 for remainder ");
        int choice = ob.nextInt();
        switch (choice)
        {
          case 1 : 
              System.out.println("The Sum is\t "+ (a+b));
              break;
              case 2 :
                  System.out.println("The product is\t"+ (a*b));
                  break;
                  case 3 :
                      System.out.println("The difference is \t"+ (Math.abs(a-b)));
                      break;
                      case 4 :
                          System.out.println("The qootient is \t"+ (a/b));
                          break;
                          case 5 :
                              System.out.println("The remainder is \t"+ (a%b));
                              break;
                              default :
                                  System.out.println("Invalid input");
                                  break;
        }
    }
}
    
