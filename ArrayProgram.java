/* Java Program to print the elements of an array present on even position
37) Java Program to print the elements of an array present on odd position
38) Java Program to print the largest element in an array
39) Java Program to print the smallest element in an array
40) Java Program to print the number of elements present in an array
41) Java Program to copy all elements of one array into another array
42) Java Program to find the frequency of each element in the array
43) Java Program to left rotate the elements of an array
44) Java Program to print the duplicate elements of an array
45) Java Program to print the sum of all the items of the array
46) Java Program to rotate the elements of an array in the right direction */
package exercise;
import java.util.*;
interface ArrayPerformance
{
   void elementsOfEvenPosition();
   void elementsOfOddPosition();
   void largestArrayElement();
   void smallestArrayElement();
   void numberOfElement();
   void CopyArrayElements();
   void frequencyOfEachElement();
   void leftRotateArrayElements();
   void printDuplicateElement();
   void SumOfAllElemnts();
   void rightRotateArrayElement();
}
public class ArrayProgram implements ArrayPerformance {
    void getInfo() {
        int choice, condition = 0;
        Scanner ip = new Scanner(System.in);
        do {
            System.out.println("Enter the choice to perform Activity");
            System.out.println("1.to print the elements of an array present on even position");
            System.out.println("2.to print the elements of an array present on odd position");
            System.out.println("3.to print the largest element in an array");
            System.out.println("4.to print the smallest element in an array");
            System.out.println("5.to print the number of elements present in an array");
            System.out.println("6.to copy all elements of one array into another array");
            System.out.println("7.to find the frequency of each element in the array");
            System.out.println("8.to left rotate the elements of an array");
            System.out.println("9. to print the duplicate elements of an array");
            System.out.println("10.to print the sum of all the items of the array");
            System.out.println("11.to rotate the elements of an array in the right direction .");
            choice = ip.nextInt();
            switch (choice) {
                case 1:
                    elementsOfEvenPosition();
                    break;
                case 2:
                    elementsOfOddPosition();
                    break;
                case 3:
                    largestArrayElement();
                    break;
                case 4:
                    smallestArrayElement();
                    break;
                case 5:
                    numberOfElement();
                    break;
                case 6:
                    CopyArrayElements();
                    break;
                case 7:
                    frequencyOfEachElement();
                    break;
                case 8:
                    leftRotateArrayElements();
                    break;
                case 9:
                    printDuplicateElement();
                    break;
                case 10:
                    SumOfAllElemnts();
                    break;
                case 11:
                    rightRotateArrayElement();
                    break;
                    default:
                    System.out.println("please.. Enter the correct option");
            }
            System.out.println("\n Do you want to continue ..press 1 to continue");
            condition=ip.nextInt();
        }while(condition==1);
        }
        @Override
    public void elementsOfEvenPosition() {
        int array1[]=new int[15],n;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the n value");
        n=ip.nextInt();
        System.out.println("Enter the array values");
        for(int i=0;i<n;i++)
        {
            array1[i]=ip.nextInt();
        }
        System.out.println("Even position Elements");
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(array1[i]);
            }
        }
    }
    @Override
    public void elementsOfOddPosition() {
        int array1[]=new int[15],n;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the n value");
        n=ip.nextInt();
        System.out.println("Enter the array values");
        for(int i=0;i<n;i++)
        {
            array1[i]=ip.nextInt();
        }
        System.out.println("ODD position Elements");
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(array1[i]);
            }
        }
    }
    @Override
    public void largestArrayElement() {
        int n,max=0,i;
        int a[]=new int[100];
        System.out.println("Enter no of Elements in the Array");
        Scanner ip=new Scanner(System.in);
        n=ip.nextInt();
        System.out.println("Enter values");
        for(i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        max=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Max is "+max);
    }
    @Override
    public void smallestArrayElement() {
        int n,min=0,i;
        int a[]=new int[100];
        System.out.println("Enter how many numbers");
        Scanner ip=new Scanner(System.in);
        n=ip.nextInt();
        System.out.println("Enter values");
        for(i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        min=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Minimum is "+min);
    }
    @Override
    public void numberOfElement() {
        int a[]={1,34,32,78,90};
        System.out.println("Elements of Array  A are");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("No of Elements in the array is"+a.length);
    }
    @Override
    public void CopyArrayElements() {
        int a[] = new int[100];
        int b[] = new int[100];
        int i, j, n;
        System.out.println("Enter the number elements for array");
        Scanner ip = new Scanner(System.in);
        n = ip.nextInt();
        System.out.println("Enter the values");
        for (i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }
        System.out.println("Array A values");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        for (i = 0; i < n; i++) {
            b[i] = a[i];
        }
        System.out.println("The copied array is");
        for (i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
    @Override
    public void frequencyOfEachElement() {
        int n,i,j;
        int arr[]=new int[100];
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the n value");
        n=ip.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=ip.nextInt();
        }
        int fr[]=new int[n];
        int visited=-1;
        for(i=0;i<n;i++)
        {
            int count=1;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    fr[j]=visited;
                }

            }
            if(fr[i]!=visited)
            {
                fr[i]=count;

            }
        }
        for(i=0;i<n;i++)
        {
            if(fr[i]!=visited)
            {
                System.out.println(arr[i]+"("+fr[i]+")");
            }
        }
    }
    @Override
    public void leftRotateArrayElements() {
        int arr[]=new int[100];
        int n,i,j;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter no of elements");
        n=ip.nextInt();
        System.out.println("Enter the array values");
        for(i=0;i<n;i++)
        {
            arr[i]=ip.nextInt();
        }
        int temp=arr[0];
        for(i=0;i<n;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;

        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    @Override
    public void printDuplicateElement() {
        int a[]=new int[100];
        Scanner ip=new Scanner(System.in);
        int n;
        System.out.println("Enter the n value");
        n=ip.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        System.out.println("Duplicates");
        for(int i=0;i<n;i++)
        {
            if(a[i]==a[i+1])
            {
                System.out.println(a[i]);
            }
        }
    }
    @Override
    public void SumOfAllElemnts() {
        int n,i,sum=0;
        int a[]=new int[100];
        System.out.println("Enter how many numbers");
        Scanner ip=new Scanner(System.in);
        n=ip.nextInt();
        System.out.println("Enter values");
        for(i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum is "+sum);
    }
    @Override
    public void rightRotateArrayElement() {
        int arr[]=new int[100];
        int n,i,j;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter no of elements");
        n=ip.nextInt();
        System.out.println("Enter the array values");
        for(i=0;i<n;i++)
        {
            arr[i]=ip.nextInt();
        }
        int temp=arr[n-1];
        for(i=0;i<n;i++)
        {
            arr[n-i]=arr[n-i-1];
        }
        arr[0]=temp;
        System.out.println("The Right Rotation of An Array");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
class Arrayfunctionality extends ArrayProgram
{
    public static void main(String[] args) {
        Arrayfunctionality af=new Arrayfunctionality();
        af.getInfo();
    }
}
