public class Pattern180 {
    public static void main(String[] args) {
        int i,j,n=4,k;
        for(i=1;i<2*n;i++)
        {
            for(j=1,k=3;j<=n;j++,k--)
            {
                if(i<=n)
                {
                    if(j<i+1)
                    {
                        System.out.print(k);
                    }
                }
                else
                {
                    if(j<=2*n-i)
                    {
                        System.out.print(k);
                    }
                }
            }
            System.out.println();
        }
    }
}
