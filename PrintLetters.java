/* Write a program to print a letters from the user input character to 'Z' without using
strings */
package exercise;
import java.util.Scanner;
public class PrintLetters {
    int unicode;
    void calculation(char character)
    {
        unicode=character;
        for(int i=unicode;i<=90;i++)
        {
            character=(char)i;
            System.out.print(character);
        }
    }
}
class Letters
{
    public static void main(String[] args) {
        char character;
        System.out.println("Enter the UPPERCASE character to print the string");
        Scanner ip=new Scanner(System.in);
        character=ip.next().charAt(0);
        PrintLetters object=new PrintLetters();
        object.calculation(character);
    }
}