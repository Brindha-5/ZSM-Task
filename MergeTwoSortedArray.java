package tuesday_12;

import java.util.Scanner;

public class MergeTwoSortedArray {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of elemnts in first Array");
        int n=ip.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values in first Array");
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        System.out.println("Enter the number of elemnts in second Array");
        int m=ip.nextInt();
        int b[]=new int[m];
        System.out.println("Enter the values in second Array");
        for(int i=0;i<m;i++)
        {
            b[i]=ip.nextInt();
        }
int c[]=new int[m+n];
        int k=0,i=0,j=0;
        while(i<n&&j<m)
        {
            if(a[i]<b[j]) {
                c[k++]=a[i++];
            }
            else if(a[i]==b[j])
            {
                c[k++]=a[i++];
                j++;
            }
            else if(a[i]>b[j])
            {
                c[k++]=b[j++];
            }
        }
        while(i<n)
        {
            c[k++]=a[i++];
        }
        while(j<m)
        {
            c[k++]=b[j++];
        }
        for(i=0;i<k;i++)
        {
            System.out.print(c[i]+" ");
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedArray m=new MergeTwoSortedArray();
        m.display();
    }
}
