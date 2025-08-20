class e
{
    public static void main(String args[])
    {
        int r,c;
        for(r=70;r>=65;r--)
        {
            System.out.print("#");
            for(c=65;c<=r;c++)
            {
            System.out.print((char)c);
            }
            System.out.println();
        }
    }
}