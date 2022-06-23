public class Pattern275 {
    public static void main(String[] args) {
        int i,j,n=5,k=1;
        for(i=1;i<=n;i++) {
            for(j=n,k=1;j>=1;j--,k++)
            {
                if(i>=j)
                {
                    if(j%2!=0)
                    {
                        System.out.print(k+" ");
                    }
                    else {
                        System.out.print("*"+" ");
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        }
}
