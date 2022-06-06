/* Given two sorted arrays, merge them such that the elements are not repeated
Example 1:
Input: Array 1: 2,4,5,6,7,9,10,13
         Array 2: 2,3,4,5,6,7,8,9,11,15
Output: Merged array: 2,3,4,5,6,7,8,9,10,11,13,15*/
package exercise;
import java.util.Scanner;
public class MergeTwoSortedArrays {
    void toMergeSort()
    {
        int firstArray[]=new int[10];
        int secondArray[]=new int[10];
        int resultArray[]=new int[25];
        int i=0,j=0,k=0,m,n,count=0;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of Elements in FirstArray");
        m=ip.nextInt();
        System.out.println("Enter the Elements for FirstArray");
        for(i=0;i<m;i++)
        {
            firstArray[i]=ip.nextInt();
        }
        System.out.println("Enter the number of Elements in SecondArray");
        n=ip.nextInt();
        System.out.println("Enter the Elements for SecondArray");
        for(i=0;i<n;i++)
        {
            secondArray[i]=ip.nextInt();
        }
    i=0;
    j=0;
        while(i<m&&j<n)
    {
        if(firstArray[i]<secondArray[j])
        {
            resultArray[k++]=firstArray[i++];
        }
        else if(firstArray[i]==secondArray[i])
        {
            resultArray[k++]=firstArray[i++];
            j++;
            count++;
        }
        else
        {
            resultArray[k++]=secondArray[j++];
        }
    }
        while(i<m)
    {
        resultArray[k++]=firstArray[i++];
    }
        while(j<n)
    {
        resultArray[k++]=secondArray[j++];
    }
        for(i=0;i<(m+n-count);i++)
    {
        System.out.print(resultArray[i]+" ");
    }
}
}class MergeArray extends MergeTwoSortedArrays
{
    public static void main(String[] args) {
        MergeArray object=new MergeArray();
        object.toMergeSort();
    }
}
