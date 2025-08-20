import java.util.*;
class input
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        int a,s=0;
        double avg = 0;
        for( a =1;a<=10;a+=1)
        {
            System.out.println("Enter number "+a+":");
            int b = ob.nextInt();
            s += b;
            avg = (s)/10.0;
        }
        System.out.println("The sum is "+s);
        System.out.println("the average is "+ avg);
    }
}