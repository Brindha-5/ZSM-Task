public class Pattern459 {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<n*2;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i<=n)
                {
                    if(j<=n-i+1)
                    {
                        System.out.print("*");
                    }
                }
               else
                {
                    if(j<=i-n+1)
                    {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

}
