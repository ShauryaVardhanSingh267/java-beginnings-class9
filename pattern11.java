class pattern11
{
    public static void main(String args[])
    {
        int r,c;
        for(r=1;r<=5;r++)
        {
            for(c=1;c<=r;c++)
            System.out.print(r+"\t");
            System.out.print("$");
            System.out.println();
        }
    }
}