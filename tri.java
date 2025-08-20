import java.util.*;
class tri
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter any three numbers");
    int a,b,c;
    a= ob.nextInt();
    b= ob.nextInt();
    c= ob.nextInt();
    double s= (a+b+c)/2.0;
    double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("The area of the triangle is "+area);
}
}