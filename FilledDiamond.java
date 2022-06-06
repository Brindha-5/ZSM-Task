/*
) Write a program to print the following pattern for the given input number.
Eg 1:  Input: 4
        Output:
********
***__***
**____**
*______*
**____**
***__***
********
 */
package exercise;
import java.util.Scanner;
class Diamond
{
    void displayDiamond() {
        int i, j, stars, space, n;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the n value");
        n = ip.nextInt();
        stars = n / 2 + 1;
        space = 0;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= stars; j++)
                System.out.print("*");
            for (j = 1; j <= space; j++)
                System.out.print("-");
            for (j = 1; j <= stars; j++)
                System.out.print("*");
            System.out.println();
            if (i < n / 2 + 1) {
                stars = stars - 1;
                space = space + 2;
            }
            if (i == n / 2 + 1) {
                stars = 2;
                space = n - 3;
            }
            if (i > n / 2 + 1) {
                stars = stars + 1;
                space = space - 2;
            }
        }
    }
}
public class FilledDiamond extends Diamond {
    public static void main(String[] args) {
           FilledDiamond fd=new FilledDiamond();
           fd.displayDiamond();
        }
    }
