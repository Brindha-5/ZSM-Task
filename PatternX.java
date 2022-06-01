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
    void patternType1(ArrayList pattern) {
        int i, j;
        for (i = 1; i <= pattern.size(); i++) {
            for (j = 1; j <= pattern.size(); j++) {
                if (i == j) {
                    System.out.print(pattern.get(i));
                } else if (i + j == pattern.size() + 1) {
                    System.out.print(pattern.get(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    void patternType2(ArrayList pattern) {
        int i, j;
        for (i = 1; i <= pattern.size(); i++) {
            for (j = 1; j <= pattern.size(); j++) {
                if (i == j) {
                    System.out.print(pattern.get(i));
                } else if (i + j == (pattern.size() + 1)) {
                    System.out.print(pattern.get(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

class XPattern
{
    public static void main(String[] args) {
        int i,j,n,choice;
        ArrayList<Integer> pattern=new ArrayList<>();
        PatternX object=new PatternX();
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of elements in the ArrayList");
        n=ip.nextInt();
        System.out.println("Enter the values");
        for(i=1;i<=n;i++)
        {
            pattern.add(ip.nextInt());
        }
        System.out.println(" Enter your choice ..press 1 for Type1 and press 2 for Type2");
        choice=ip.nextInt();
        if(choice==1) {
            object.patternType1(pattern);
        }
        else {
            object.patternType2(pattern);
        }
    }
}
