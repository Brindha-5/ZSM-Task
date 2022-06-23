import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int first[]=new int[10];
        int second[]=new int[10];
        int result[]=new int[20];
        int m,n,count=0;
        System.out.println("Enter the no of elements");
        m=ip.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<m;i++)
        {
            first[i]=ip.nextInt();
        }
        System.out.println("Enter the no of elements");
        n=ip.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            second[i]=ip.nextInt();
        }
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            if(first[i]<second[j])
            {
                result[k++]=first[i++];
            }
            else if(first[i]==second[j])
            {
                result[k++]=first[i++];
                j++;
                count++;
            }
            else {
                result[k++]=second[j++];
            }
        }
        while(i<m)
        {
          result[k++]=first[i++];
        }
        while(j<n)
        {
            result[k++]=second[j++];
        }
        for(i=0;i<m+n-count;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
