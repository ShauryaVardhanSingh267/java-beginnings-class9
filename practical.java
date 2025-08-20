class practical
{
    public static void main(String args[])
    {
        int r,c,a=96;
        for(r=1;r<=4;r++)
        {
            for(c=r;c>=1;c--)
            {
            a++;
            System.out.print((char)a);
            }
            System.out.println();
        }
    }
}