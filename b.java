class b
{
    public static void main(String args[])
    {
        int r,c;
        for(r=1;r<=5;r++)
        {
            for(c=1;c<=r;c++)
            
                System.out.print(c+"\t");
                System.out.println();
            
        }
        for(r=5;r>=1;r--)
        {
            for(c=1;c<=r;c++)
            {
            System.out.print(c+"\t");}
            System.out.println();
            }
        
        }
}