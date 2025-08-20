class a
{
    public static void main(String args[])
    {
        int r,c;
        for(r=1;r<=7;r=r+2)
        {
            for(c=1;c<=4;c++)
            {
                System.out.print(r+"\t");}
                System.out.println();
                for(c=1;c<=4;c++)
                System.out.print("* \t");
                System.out.println();
            }
        }
}