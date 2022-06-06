/*51) Write a program to display the number in reverse order without use of String
        functions.
        Eg 1:  Input: 12345
        Output :The number in reverse order is : 54321
        52) Using Recursion reverse the string such as
        Eg 1:  Input: one two three
        Output: three two one
        Eg 2:  Input: I love india
        Output: india love I */
package exercise;
import java.util.*;
public class Reverse {
    void getInput() {
        int number, condition = 0, choice;
        String sentence;
        Scanner ip = new Scanner(System.in);
        do {
            System.out.println("Enter your Choice");
            System.out.println("1.To reverse the String");
            System.out.println("2.To rverse the sentence");
            choice = ip.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Number to Reverse");
                    number = ip.nextInt();
                    reverseProcess(number);
                    break;
                case 2:
                    System.out.println("Enter the Sentence to Reverse");
                    ip.nextLine();
                    sentence = ip.nextLine();
                    reverseProcess(sentence);
                    break;
                default:
                    System.out.println("Please... Enter the correct Choice");
            }
            System.out.println("\n Do you want to Continue.. if yes Press 1");
            condition = ip.nextInt();
        } while (condition == 1);
    }

    void reverseProcess(int number) {
        int temp, rem, rev = 0;
        temp = number;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println("The reversed number is" + rev);
    }
    void reverseProcess(String sentence) {
        String string_array[] = sentence.split(" ");
        System.out.println("The reversed sentence is");
        for (int i = string_array.length - 1; i >= 0; i--) {
            System.out.print(string_array[i] + " ");
        }
    }
}
class NumberAndSentence extends Reverse
{
    public static void main(String[] args) {
        NumberAndSentence ns=new NumberAndSentence();
        ns.getInput();
    }
}
