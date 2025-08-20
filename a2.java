import java.util.*;
class a2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of units of electricity consumed this month");
        int a = ob.nextInt();
        double b = 0.0 ;  
        if(a<=100)
        b = a*5.5;
        else if(a>100&&a<=300)
        b = 550 + (a-100)*6.5;
        else if(a>300&&a<=600)
        b = 550 + 1300 + (a-300)*8;
        else
        b = 550 + 1300 + 2400 + (a-600)*12;
        System.out.println("The bill you have to pay is of Rs."+ b);
    }
}