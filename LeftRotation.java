/* Java Program to left rotate the elements of a multidimensional array. */
package exercise;
import java.util.Scanner;
public class LeftRotation {
    void rotation() {
        int a[][]=new int[15][15];
        Scanner ip=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter the no of rows");
        r=ip.nextInt();
        System.out.println("Enter the no of Column");
        c=ip.nextInt();
        int trans[][]=new int[10][10];
        System.out.println("Enter the array values");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=ip.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                trans[j][i]=a[i][j];
            }
        }
        System.out.println("Transpose of the array");
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println("");
        }
        int tr=trans.length;
        int tc=trans[0].length;
        for(i=0;i<c;i++)
        {
            int start=0;
            int end=r-1;
            while(start<end)
            {
                int temp=trans[i][start];
                trans[i][start]=trans[i][end];
                trans[i][end]=temp;
                start++;
                end--;
            }
        }
        System.out.println("The Result of 90  degree Rotation");
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
class ArrayRotation
    {
        public static void main(String[] args) {
            LeftRotation lr=new LeftRotation();
            lr.rotation();
        }
    }


