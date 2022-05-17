import java.io.*;
import java.util.*;
class BubbleSort
  {
    public static void main(String args[])
    {
      int a[]=new int[20];
      int n,i,j;
      Scanner ip=new Scanner(System.in);
      System.out.println("Enter the no of elements");
    n=ip.nextInt();
      System.out.println("Enter the array values");
      
        for(i=0;i<n;i++)
          {
            a[i]=ip.nextInt();
          }
      for(i=0;i<n-1;i++)
        {
          for(j=0;j<n-1-i;j++)
            {
              if(a[j]>a[j+1])
              {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
              }
            }
        }
      System.out.println("After Bubble Sorting");
      for(i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
      
    }
  }