import java.util.*;
class LoopFor
{
    public static void main(String args[])
    {
        int i,n,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        /* 10%1 ==0   
         * 10%2 ==0
         * 10%3 ==0
         * if(n%i==0)
         */
        for(i=1;i<=n;i++)
            if(n%i==0)
            {
                System.out.println(i);//factors of a no
                s=s+1;//counting no of factors
                

            }
        //print sum of factors or count of factors
        //outside the loop so that you get a total sum
        System.out.println(s);
        
    }
}