/*1) Write a single program to generate a multiplicaiton and subtraction table for a given
        number.*/
package exercise;
import java.util.Scanner;
interface Calcualtion
{
    int startingNumber=1,lastNumber=10;
    void additionTable(int number);
    void subtractionTable(int number);
    void multiplicationTable(int number);
}
public class Tables implements Calcualtion {
    void displayTable()
    {
        int number,condition=0;
        Scanner ip=new Scanner(System.in);
        do {
            System.out.println("Enter the choice to Proceed");
            System.out.println("1.To calculate and Print the Addition Table");
            System.out.println("2.To calculate and print the Subtraction Table");
            System.out.println("3.To calculate and Print the Multiplication Table");
            int choice = ip.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number to perform addition");
                    number = ip.nextInt();
                    System.out.println("*** The Addition Table of given number is  ***");
                    additionTable(number);
                    break;
                case 2:
                    System.out.println("Enter a number to perform Subtraction");
                    number = ip.nextInt();
                    System.out.println("*** The Subtraction Table of given number is  ***");
                    subtractionTable(number);
                    break;
                case 3:
                    System.out.println("Enter a number to perform Multiplication");
                    number = ip.nextInt();
                    System.out.println("*** The Multiplication Table of given number is  ***");
                    multiplicationTable(number);
                    break;
                default:
                    System.out.println("Please check the number that you entered");
            }
            System.out.println("Do you want to continue.. if yes press 1 else press 2");
            condition = ip.nextInt();
        }while(condition==1);
    }
    @Override
    public void additionTable(int number) {
        for (int index = startingNumber; index <= lastNumber; index++) {
            int addition = index + number;
            System.out.printf("%d + %d= %d \n", index, number, addition);
        }
    }
    @Override
    public void subtractionTable(int number) {
        for (int index = startingNumber; index <= lastNumber; index++) {
            int subtraction = index - number;
            System.out.printf("%d - %d= %d \n", index, number, subtraction);
        }
    }@Override
    public void multiplicationTable(int number) {
        for (int index = startingNumber; index <= lastNumber; index++) {
            int multiplication = index * number;
            System.out.printf("%d * %d= %d \n", index, number, multiplication);
        }
    }
}
class Calculation
{
    public static void main(String[] args) {
        Tables object = new Tables();
        object.displayTable();
    }
}