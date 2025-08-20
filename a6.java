import java.util.*;
class a6
{
    public static void main(String Args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x=ob.nextInt();
        System.out.println("Enter the second number");
        int y=ob.nextInt(),i,d,c=0;
        for(i=x;i<=y;i++)
        {
        if(y%i==0)
        {
        c=c+1;
        if(c==2)
        System.out.println("Prime Number"+y);
    }
}
}
}