import java.util.*;
class prac9
{
public static void main (String args [])
{
    Scanner ob=new Scanner(System.in);
    int n,s=0; 
    do
    {
        System.out.println("Enter a number\n\\t\t or\t\t \n Enter 0 to exit ");
        n= ob.nextInt();
        s=s+n;
    }
    while(n!=0);
    System.out.println("Sum is -->"+s);
}
}