import java.util.*;
public class AlternateSorting {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n;
        int a[]=new int[15];
        System.out.println("Enter the number of elements");
        n=ip.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        int i=0;
        int j=0;
        int k=n;
        n=n-1;
        int result[]=new int[10];
        while(i<n)
        {
        result[j++]=a[n--];
        result[j++]=a[i++];
        }
        if(n%2!=0)
        {
            result[j++]=a[i++];
        }
        for( i=0;i<k;i++)
        {
           System.out.println(result[i]);
        }
    }
}
