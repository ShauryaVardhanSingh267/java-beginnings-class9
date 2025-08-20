import java.util.*; 
class round_off
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner (System.in);
        System.out.println("Enter a number");
        double a = ob.nextDouble();
        System.out.println("Enter 1 for for normal round off , 2 for rounding off to the higher value and 3 for rounding off to the lower value");
        int choice = ob.nextInt();
        switch(choice)
        {
          case 1 :
              System.out.println("normal round off ="+(Math.rint(a)));
              break;
              case 2 :
                  System.out.println("higher round off ="+(Math.ceil(a)));
                  break;
                  case 3 :
                      System.out.println("lower round off ="+(Math.floor(a)));
        }
    }
}