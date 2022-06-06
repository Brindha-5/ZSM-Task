/*  Write a program to give the following output for the given input:
Eg 1:  Input: a1b10
Output: abbbbbbbbbb
Eg: 2:  Input: b3c6d15
           Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
*/
package exercise;
import java.util.*;
public class ExpandString {
    void expandTheString() {
        String str;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the string");
        str = ip.nextLine();
        int n = str.length();
        String s1 = " ";
        int i = 0;
        int count = 0;
        while (i < n) {
            char ch = str.charAt(i++);
            while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count = (count * 10) + (str.charAt(i++) - '0');
            }
            while (count != 0) {
                s1 = s1 + Character.toString(ch);
                count--;
            }
        }
        System.out.println(" " + s1);
    }
}
class StringExpantion extends ExpandString
{
    public static void main(String[] args) {
        StringExpantion se=new StringExpantion();
        se.expandTheString();
    }
}

