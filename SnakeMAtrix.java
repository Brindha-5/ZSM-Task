import java.util.Scanner;

public class SnakeMAtrix {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int m, n, rs, re, cs, ce;
        int a[][] = new int[10][10];
        System.out.println("Enter the row value");
        m = ip.nextInt();
        System.out.println("Enter column value");
        n = ip.nextInt();
        System.out.println("Enter values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = ip.nextInt();
            }
        }
        System.out.println("The values are");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        rs = 0;
        re = m - 1;
        cs = 0;
        ce = n - 1;
        while(rs<=re&&cs<=ce)
        {
            for(int i=cs;i<=ce;i++)
            {
                System.out.print(a[rs][i]+" ");
            }
            rs=rs+1;
            if(rs<=re) {
                for (int i = ce; i >= cs; i--) {
                    System.out.print(a[rs][i] + " ");
                }
                rs = rs + 1;
            }
        }
    }
}
