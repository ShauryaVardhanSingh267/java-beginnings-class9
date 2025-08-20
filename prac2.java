import java.util.*;
class prac2
{
    public static void main(String args [])
    {
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle to know wether the triangle is possible or not");
        System.out.println("First side is -->");
        int a=ob.nextInt();
        System.out.println("Second side is -->");
        int b=ob.nextInt();
        System.out.println("Third side is -->");
        int c=ob.nextInt();
        if((a+b>c) && (b+c>a) && (a+c>b))
        System.out.println("The triangle is possible");
        else
        System.out.println("The triangle is not possible");
    }
}