import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    void toSort()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=ip.nextInt();
        int a[]=new int[10];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++) {
            a[i]=ip.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            int j=i;
           while(j>0&&(a[j-1]>a[j]))
            {
               int temp=a[j];
               a[j]=a[j-1];
               a[j-1]=temp;
               j--;
                }
            }


   //     System.out.println(Arrays.toString(a));
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args) {
        InsertionSort bs=new InsertionSort();
        bs.toSort();
    }
}
