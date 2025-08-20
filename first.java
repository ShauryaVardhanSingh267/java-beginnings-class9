class first
{
    public static void main(String args[])
    {
        int a=5,b=4,c=6;
        double s= (a+b+c)/2.0;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is "+area);
    }
}