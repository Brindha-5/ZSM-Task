/* Alternate sorting: Given an array of integers, rearrange the array in such a way that
the first element is first maximum and second element is first minimum.
Example: Input : {1, 2, 3, 4, 5, 6, 7}
Output: {7, 1, 6, 2, 5, 3, 4}*/
package exercise;
import java.util.*;
public class AlternateSorting {
    void getInput() {
        int i, j, k, n;
        int a[] = new int[100];
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        n = ip.nextInt();
        System.out.println("Enter the elements");
        for (i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (a[i] > a[j]) {
                    k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }
            }
        }
        System.out.println("Sorted Array");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        i = 0;
        j = n - 1;
        System.out.println("The alternate arrangement of array");
        while (i < j) {
            System.out.print(a[j--] + " ");
            System.out.print(a[i++] + " ");
        }
        if (n % 2 != 0) {
            System.out.print(a[i]);
        }
    }
}
class Sorting extends AlternateSorting
{
    public static void main(String[] args) {
        Sorting s=new Sorting();
        s.getInput();
    }
}
