import java.util.*;
class a1
{
public static void main (String args [])
{
    Scanner ob = new Scanner (System.in);
    System.out.println("Enter the first side ");
    int a = ob.nextInt();
    System.out.println("Enter the seccond side ");
    int b = ob.nextInt();
    System.out.println("Enter the third side ");
    int c = ob.nextInt();
    if((a+b>c)&&(b+c>a)&&(c+a>b))
    System.out.println("Triangle is possible");
    else
    System.out.println("Triangle is not possible");
}
}
