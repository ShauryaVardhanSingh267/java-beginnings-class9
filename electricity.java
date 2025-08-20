import java.util.*;
class electricity
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter the units of electricity consumed");
        int a= ob.nextInt();
        double bill = 0.0d;
        if(a<=100)
        bill = a * 5.5;
        else if(a<=200)
        bill = a * 6.5;
        else if(a<=500)
        bill = a * 8.0;
        else if(a>500)
        bill = a * 12.0;
        System.out.println("You have to pay "+bill+"Rupees");
    }
}