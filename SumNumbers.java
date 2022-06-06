/*
) Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
1111 +.. n terms.
Eg 1: Input:  Input the number of terms : 5
Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
Eg 2: Input:  Input the number of terms : 3
Output :
1 + 11 + 111
The Sum is : 123
 */
package exercise;
import java.util.*;
public class SumNumbers {
    void printSeries() {
        int n, a = 1, se = 0, num = 0;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the n value");
        n = ip.nextInt();
        for (int i = 1; i <= n; i++) {
            num = num + a;
            se = a;
            a = se * 10 + 1;
        }
        System.out.println("1+11+111+..n is  " + num);
    }
}
class SumOfSeries extends SumNumbers
{
    public static void main(String[] args) {
        SumOfSeries se=new SumOfSeries();
        se.printSeries();
    }
}
