public class SnakePattern {
    public static void main(String[] args) {
        int i,j,n=10,k=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=2*n-i;j++)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");
                }
                else if(i%2!=0)
                {
                    k++;
                    System.out.print(k);
                }
                else
                {
                    System.out.print(k);
                    k--;
                }
            }
            System.out.println();
            k=k+n;
        }
    }
}
