/*
 Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1.
Eg 1: Input: String 1: test123string
          String 2: 123
         Output: 4
Eg 2:  Input: String 1: testing12
         String 2: 1234
         Output: -1
 */
package exercise;
import java.util.Scanner;
public class Substring {
    void display() {
        String s1, s2;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the First String");
        s1 = ip.next();
        System.out.println("Enter the second String");
        s2 = ip.next();
        System.out.println("The result is");
        System.out.println(s1.indexOf(s2));
    }
}
class SubstringIndex extends Substring{
    public static void main(String[] args) {
        SubstringIndex ss=new SubstringIndex();
        ss.display();
    }
}