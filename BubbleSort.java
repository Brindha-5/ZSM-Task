import java.util.*;
public class BubbleSort {
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
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(a[j-1]>a[j])
                {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args) {
        BubbleSort bs=new BubbleSort();
        bs.toSort();
    }
}
