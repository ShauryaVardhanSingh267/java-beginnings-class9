import java.util.*;
class a3
{
    public static void main(String args[])
    {
      Scanner ob = new Scanner (System.in);
      System.out.println("Enter the number of days you had the library book");
      int a = ob.nextInt();
      double f = 0.0d;
      if(a<=7)
      f = a*10;
      else if(a>=8&&a<=16)
      f = 70 +(a-7)*12;
      else if(a>=17&&a<=25)
      f = 70 + 108 + (a-16)*15;
      else 
      f = 70 + 108 + 135 +(a-25)*30;
      System.out.println("You will have to pay a fine of Rs. "+f);
    }
}