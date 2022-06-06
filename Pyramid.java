/* Write a programs to print following patterns */
package exercise;
import java.util.Scanner;
abstract class PyramidPattern
{
    abstract void increaseNumberPattern();
    abstract void decreaseNumberPattern();
    abstract void numberPattern();
    abstract void starPattern();
    abstract void trianglePattern();
}
public class Pyramid extends PyramidPattern{
    @Override
    void increaseNumberPattern() {
        int i,j,n;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number to print the pattern");
        n=ip.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<(2*i+1);j++)
            {
                if(i<j)
                {
                    System.out.print(n-j+i+" ");
                }
                else
                {
                    System.out.print(n-i+j+" ");
                }
            }
            System.out.println();
        }
    }
    @Override
    void decreaseNumberPattern() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int n = s.nextInt();
        int i, j, k = 0;
        for (i = 0; i < n; i++) {
            k = 1;
            for (j = 0; j < (n + i); j++) {
                if (j < n - i - 1)
                    System.out.print(" ");
                else {
                    System.out.print(" " + k);
                    if (j < (n - 1))
                        k++;
                    else
                        k--;
                }
            }
        }
    }
    @Override
    void numberPattern() {
        int i,j,n,k;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number to print the pattern");
        n=ip.nextInt();
        k=n;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i<=j)
                {
                    System.out.print(k+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            k--;
        }
    }
    @Override
    void starPattern() {
        int i,j,n;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number to print the pattern");
        n=ip.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i<=j)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    @Override
    void trianglePattern() {
        int k=1,n,i,j;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number to print the Triangle Pattern ");
        n=ip.nextInt();
        for( i=1;i<=n;i++)
        {
            for( j=n;j>=1;j--)
            {
                if(i>=j)
                {
                    System.out.print(k+" ");
                    k++;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
class PatternPyramid extends Pyramid {
    public static void main(String[] args) {
        PatternPyramid pp = new PatternPyramid();
        pp.increaseNumberPattern();
        pp.numberPattern();
        pp.starPattern();
        pp.trianglePattern();
    }
}
