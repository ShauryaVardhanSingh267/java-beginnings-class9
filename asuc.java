class asuc
{
    public static void main(String args[])
    {
        int c,r,i,j;
        for(r=1;r<=9;r+=2)
        {
            for(c=1;c<=r;c+=2)
            System.out.print(c);
            System.out.println();
        }
        for(i=7;i>=1;i-=2)
        {
            for(j=1;j<=i;j+=2)
            System.out.print(j);
            System.out.println();
        }
    }
}