import java.util.Scanner;
public class SelectionSort {
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
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min]) {
                    min = j;
                }
            }
            if(a[i]!=a[min]){
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args) {
        SelectionSort bs=new SelectionSort();
        bs.toSort();
    }
}
