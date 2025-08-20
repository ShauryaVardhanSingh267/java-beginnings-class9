import java.util.*;
class abd
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter three numbers");
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        if (a>b && c>b && c<a)
        System.out.println("The second largest number is "+c);
        else if(b>c && a>c && a<b)
        System.out.println("The second largest number is "+a);
        else if(a>c && b>c && a<b)
        System.out.println("The second largest number is "+a);
        else if(b>c && a>c && b<a)
        System.out.println("The second largest number is "+b);
        else if(c>a && b>a && b<c)
        System.out.println("The second largest number is "+b);
        else if(b>c && a>c && c<b)
        System.out.println("The second largest number is "+c);
    }
}