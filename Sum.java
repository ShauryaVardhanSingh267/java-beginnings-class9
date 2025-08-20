import java.util.*;
class Sum 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,s=0;
        for(i=1;i<=10;i=i+1)
        {
            System.out.print("Enter number "+i+" : ");
            n=sc.nextInt();
            s=s+n;
        }
        double avg=s/10.0;
        System.out.println("Sum= "+s+"\nAverage= "+avg);
    }
}

