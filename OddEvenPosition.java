/*
Write a program to sort the elements in odd positions in descending order and
elements in ascending order.
Eg 1:  Input:  13,2 4,15,12,10,5
         Output: 13,2,12,10,5,15,4
Eg 2:  Input: 1,2,3,4,5,6,7,8,9
         Output: 9,2,7,4,5,6,3,8,1
 */
package exercise;
import java.util.*;
public class OddEvenPosition {
    void display()
    {
        int a[]=new int[100];
        int i,j,n,temp;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=ip.nextInt();
        System.out.println("Enter the elements");
        for(i=1;i<=n;i++)
        {
            a[i]=ip.nextInt();
        }
        for(i=2;i<=n;i=i+2)
        {
            for(j=i;j<=n;j=j+2)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=1;i<=n;i=i+2)
        {
            for(j=i;j<=n;j=j+2)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The Result");
        for(i=1;i<=n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
class PositionSorting
{
    public static void main(String[] args) {
        {
            OddEvenPosition oe=new OddEvenPosition();
            oe.display();
        }
    }
}