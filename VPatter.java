import java.util.*;
public class VPatter {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<2*n;j++)
            {
                if(i>=j)
                {
                    System.out.print("*");
                }
                else if(j>=2*n-i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
