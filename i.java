import java.util.*;
class i
{
    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,sum=0,d,p;
        System.out.println("Enter a number");
        num=in.nextInt();
        p=num;
        while(num!=0){
            d=num%10;
            int product=1;
            for(int i=1; i<=d; i++)
            product= product*i;
           
            sum=sum+product;
            num=num/10;
        }
        if(p==sum)
        System.out.println("Niven no.");
        else
        System.out.println(" Not a Niven no.");
       
        }
    }