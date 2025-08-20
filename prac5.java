import java.util.*;
class prac5
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of days you had the library book with you");
        int a=ob.nextInt();
        double fine=0.0d;
        if(a<=7) 
        {
            fine = (10*a);
        }
        else if(a>=8 && a<=16) 
        {
            fine = (12*(a-7))+70;
        }
        else if(a>=17 && a<=25) 
        {
            fine = (15*(a-16))+96+70;
        }
        else if(a>25) 
        {
            fine = (30*(a-25))+375+96+70;
        }
        System.out.println("Your library fine is --> Rs. "+ fine);
    }
}