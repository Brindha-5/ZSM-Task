// Write a program to define the functionality of a Bitwise operators.
package exercise;
import java.util.Scanner;
abstract class BitWise
{
    abstract void bitwiseOR(int num1,int num2);
    abstract void bitwiseAND(int num1,int num2);
    abstract void bitwiseXOR(int num1,int num2);
    abstract void bitwiseComplement(int num1);
    abstract void leftShift(int num1);
    abstract void rightShift(int num1);
}
public class BitwiseOperators extends BitWise{
    int result;
    @Override
    void bitwiseOR(int num1, int num2) {
    result=num1|num2;
    System.out.printf("\n %d | %d =%d ",num1,num2,result);
    }
    @Override
    void bitwiseAND(int num1, int num2) {
        result=num1&num2;
        System.out.printf("\n %d & %d =%d ",num1,num2,result);
    }
    @Override
    void bitwiseXOR(int num1, int num2) {
        result=num1^num2;
        System.out.printf("\n %d ^ %d =%d ",num1,num2,result);
    }
    @Override
    void bitwiseComplement(int num1) {
        result=~num1;
        System.out.printf("\n ~ %d=%d ",num1,result);
    }
    @Override
    void leftShift(int num1) {
        result=num1>>2;
        System.out.printf("\n The Left shift of %d is %d ",num1,result);
    }
    @Override
    void rightShift(int num1) {
        result=num1<<2;
        System.out.printf("\n The Right shift of %d is %d ",num1,result);
    }
}
class Operators
{
    public static void main(String[] args) {
        int num1, num2, choice,condition=0;
        BitwiseOperators object = new BitwiseOperators();
        Scanner ip = new Scanner(System.in);
        do {
        System.out.println("Enter the choice to perform Activity");
        System.out.println("1.Bitwise OR");
        System.out.println("2.Bitwise AND");
        System.out.println("3.Bitwise XOR");
        System.out.println("4.Bitwise Complement");
        System.out.println("5.Bitwise LeftShift Operator");
        System.out.println("6.Bitwise Right Shift Operator");
        choice = ip.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the First Number to perform Bitwise OR");
                num1 = ip.nextInt();
                System.out.println("Enter the Second Number to perform Bitwise OR");
                num2 = ip.nextInt();
                object.bitwiseOR(num1, num2);
                break;
            case 2:
                System.out.println("Enter the First Number to perform Bitwise AND");
                num1 = ip.nextInt();
                System.out.println("Enter the Second Number to perform Bitwise AND");
                num2 = ip.nextInt();
                object.bitwiseAND(num1, num2);
                break;
            case 3:
                System.out.println("Enter the First Number to perform Bitwise XOR");
                num1 = ip.nextInt();
                System.out.println("Enter the Second Number to perform Bitwise XOR");
                num2 = ip.nextInt();
                object.bitwiseXOR(num1, num2);
                break;
            case 4:
                System.out.println("Enter the  Number to perform Bitwise Complement");
                num1 = ip.nextInt();
                object.bitwiseComplement(num1);
                break;
            case 5:
                System.out.println("Enter the  Number to perform Bitwise Left Shift Operation");
                num1 = ip.nextInt();
                object.leftShift(num1);
                break;
            case 6:
                System.out.println("Enter the  Number to perform Bitwise Right Shift Operation");
                num1 = ip.nextInt();
                object.rightShift(num1);
                break;
            default:
                System.out.println("please.. Enter the correct option");
        }
        System.out.println("\n Do you want to continue ..press 1 to continue");
        condition=ip.nextInt();
    }while(condition==1);
}
}