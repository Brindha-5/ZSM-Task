/*
Write a program to print the alphabet 'C' with the stars based on the given numbers
Eg 1:  Input: 4
        Output:
****
*
*
****
 */
package exercise;
 import java.util.*;
public class CPattern {
 void displayPattern() {
  int n, i, j;
  Scanner ip = new Scanner(System.in);
  System.out.println("Enter the number to print pattern");
  n = ip.nextInt();
  for (i = 0; i < n; i++) {
   for (j = 0; j < n; j++) {
    if (i == 0 || j == 0||i==n-1) {
     System.out.print("*" + " ");
    }
    else
    {
     System.out.print(" ");
    }
   }
   System.out.println();
  }
 }
}
class CPAtternPrinting extends CPattern
{
 public static void main(String[] args) {
  CPAtternPrinting cp=new CPAtternPrinting();
  cp.displayPattern();
 }
}