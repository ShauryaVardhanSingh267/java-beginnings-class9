import java.util.*;
class prac4
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your annual income to calculate the tax and the gross salary");
        int a = ob.nextInt();
        double tax ,gs=0;
        if(a<=250000)
        {
          tax = 0;
          System.out.println("Tax payeed is -->"+ tax);
        System.out.println("Gross Salary is -->"+ gs);
        }
        else if(a>=250000 && a<=500000)
        {
          tax = (2.5/100)*a;
          gs = a-tax;
          System.out.println("Tax payeed is -->"+ tax);
        System.out.println("Gross Salary is -->"+ gs);
        }
        else if(a>=500000 && a<=1000000)
        {
          tax = (5.0/100)*(a-500000); 
          gs = a-tax;
          System.out.println("Tax payeed is -->"+ tax);
        System.out.println("Gross Salary is -->"+ gs);
        }
        else if(a>1000000)
        {
          tax = (12.0/100)*(a-1000000)+250000;
          gs = a-tax;
          System.out.println("Tax payeed is -->"+ tax);
        System.out.println("Gross Salary is -->"+ gs);
        }
      
    }
}
