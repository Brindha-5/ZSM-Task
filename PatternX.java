/*Write a program to print the following output for the given input. You can assume the
        string is of odd length
        Eg 1:  Input: 12345
        Output:
        1       1
        2   2
        3
        4   4
        5        5

        2)                         Output:
1       5
  2   4
    3
  2   4
1        5 */
package exercise;
import java.util.ArrayList;
import java.util.Scanner;
public class PatternX {
    void print()
    {
    int i,j,n,choice;
    ArrayList<Integer> pattern=new ArrayList<>();
    Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of elements in the ArrayList");
    n=ip.nextInt();
        System.out.println("Enter the values");
        for(i=0;i<n;i++)
    {
        pattern.add(ip.nextInt());
    }
        System.out.println(" Enter your choice ..press 1 for Type1 and press 2 for Type2");
    choice=ip.nextInt();
        if(choice==1) {
        patternType1(pattern);
    }
        else {
        patternType2(pattern);
    }
}
    void patternType1(ArrayList pattern) {
        int i, j, k;
        k = pattern.size();
        for (i = 0; i <= pattern.size(); i++) {
            for (j = 0; j <= pattern.size(); j++) {
                if (i == j) {
                    System.out.print(pattern.get(i));
                } else if (i + j == k - 1) {
                    System.out.print(pattern.get(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    void patternType2(ArrayList pattern) {
        int i, j,k;
        k=pattern.size();
        for (i = 0; i <= pattern.size(); i++) {
            for (j = 0; j <= pattern.size(); j++) {
                if (i == j) {
                    System.out.print(pattern.get(i));
                } else if (i + j == (k-1)) {
                    System.out.print(pattern.get(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
class XPattern {
    public static void main(String[] args) {
        PatternX object = new PatternX();
        object.print();
    }
}
