class h
{
    public static void main(String args[])
    {
        int r,c;
        for(r=65;r<=69;r++)
        {
            for(c=69;c>=r;c--)
            {
                System.out.print((char)c);
            }
            System.out.println();
        }
    }
}