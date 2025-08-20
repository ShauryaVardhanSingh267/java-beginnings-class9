class f
{
    public static void main(String args[])
    {
        int r,c;
        for(r=1;r<=5;r++)
        {
            System.out.print("#");
            for(c=r;c>=1;c--)
            {
            if(c%2==0)
            System.out.print("0");
            else
            System.out.print("1");
            }
            System.out.println();
        }
    }
}