/*This program is made to tell the maximum value from the given three values */
class maximum
{
    public static void main(String args[])
    {
        int a=10,b=20,c=30;
        int d= Math.max(c,Math.max(a,b));
        System.out.println("The largest number of the three is "+d);
    }
}