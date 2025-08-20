import java.util.*;
class report
{
    public static void main(String args[])
    {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter your Name");
      String a = ob.nextLine();
      System.out.println("Enter your Class");
      int b = ob.nextInt();
      System.out.println("Enter your Section");
      char c = ob.next().charAt(0);
      System.out.println("Enter your Marks");
      int d = ob.nextInt();
      if(d>=90)
      System.out.println("Grade -> Distinction ");
      else if(d<90 && d>=60)
      System.out.println("Grade -> B");
      else if(d<60)
      System.out.println("Grade -> C");
    }
}