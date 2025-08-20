import java.util.*;
class abc
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any 2 numbers");
        int a,b,c;
        a = ob.nextInt();
        b = ob.nextInt();
        c = (a*10)+b;
        System.out.println("The two digit number will be " + c);
    }
}