import java.util.*;
class number
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any 2 numbers");
        int a,b,c=0;
        a = ob.nextInt();
        b = ob.nextInt();
        c = a+b;
        System.out.println("The Sum = "+ c);
    }
}