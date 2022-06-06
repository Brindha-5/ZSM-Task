/* Program to Find ASCII Value of a Character
25) Program to Compute Quotient and Remainder
26) Program to Demonstrate the Working of Keyword long
27) Program to Swap Two Numbers
28) Program to Check Whether a Number is Even or Odd
29) Program to Check Whether a Character is a Vowel or Consonant
30) Program to Find the Largest Number Among Three Numbers
31) Program to Find the Roots of a Quadratic Equation
32) Program to Check Whether a Number is Positive or Negative
33) Program to Check Whether a Character is an Alphabet or not
34) Program to Calculate the Sum of Natural Numbers and find the largest digit of the
sum.
35) Program to Find Factorial of a Number and the factorial number's sum of digits.
*/
package exercise;
import java.util.*;
import java.util.*;
interface Alphabets
{
     void toFindASCIIValue();
     void vowelOrConsonant();
     void alphabetOrNot();
}
abstract class Numeric implements Alphabets
{
    abstract void toComputeQuotientRemainder();
    abstract void workingOfKeywordLong();
    abstract void toSwapTwoNumbers();
    abstract void  evenOrOdd();
    abstract void toFindLargestNumber();
    abstract void rootsOfQuadraticEquation();
    abstract void positiveOrNegative();
    abstract void sumOfNaturalNumbers();
    abstract void factorialOfNumber();
}
public class Numbers extends Numeric
{
    void getOption()
    {
        int choice, condition = 0;
        Scanner ip = new Scanner(System.in);
        do {
            System.out.println("Enter the choice to perform Activity");
            System.out.println("1.To Find ASCII Value");
            System.out.println("2.To Compute Quotient and Remainder");
            System.out.println("3.To Demonstrate the Working of Keyword long");
            System.out.println("4.To Swap Two Numbers");
            System.out.println("5.To Check Whether a Number is Even or Odd");
            System.out.println("6.To Check Whether a Character is a Vowel or Consonant");
            System.out.println("7.To Find the Largest Number Among Three Numbers");
            System.out.println("8.to Find the Roots of a Quadratic Equation");
            System.out.println("9.to Check Whether a Number is Positive or Negative");
            System.out.println("10. to Check Whether a Character is an Alphabet or not");
            System.out.println("11.to Calculate the Sum of Natural Numbers");
            System.out.println("12.to Find Factorial of a Number and the factorial number's sum of digits.");
            choice = ip.nextInt();
            switch (choice) {
                case 1:
                    toFindASCIIValue();
                    break;
                case 2:
                    toComputeQuotientRemainder();
                    break;
                case 3:
                    workingOfKeywordLong();
                    break;
                case 4:
                    toSwapTwoNumbers();
                    break;
                case 5:
                    evenOrOdd();
                    break;
                case 6:
                    vowelOrConsonant();
                    break;
                case 7:
                    toFindLargestNumber();
                    break;
                case 8:
                    rootsOfQuadraticEquation();
                    break;
                case 9:
                    positiveOrNegative();
                    break;
                case 10:
                    alphabetOrNot();
                    break;
                case 11:
                    sumOfNaturalNumbers();
                    break;
                case 12:
                    factorialOfNumber();
                    break;
                default:
                    System.out.println("please.. Enter the correct option");
            }
            System.out.println("\n Do you want to continue ..press 1 to continue");
            condition=ip.nextInt();
        }while(condition==1);
    }
    @Override
   public void toFindASCIIValue() {
        char ch;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the character");
        ch=ip.next().charAt(0);
        System.out.println("ASCII value:"+(int)ch);
    }
    @Override
    void toComputeQuotientRemainder() {
        int num,quo,rem,db;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number to find Remainder and Quotient");
        num=ip.nextInt();
        System.out.println("Enter the divided by number");
        db=ip.nextInt();
        quo=num/db;
        rem=num%db;
        System.out.println("Quotient "+quo);
        System.out.println("Remainder "+rem);
    }
    @Override
    void workingOfKeywordLong() {
        long num1=10L;
        long num2=-10L;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        long num='a';
        System.out.println("num: "+num);
        long min=-9223372036854775808L;
        long max=9223372036854775807L;
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
    @Override
    void toSwapTwoNumbers() {
        int num1,num2;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the First number");
        num1=ip.nextInt();
        System.out.println("Enter the Second number");
        num2=ip.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping");
        System.out.println("First Number"+num1);
        System.out.println("Second Number"+num2);
    }
    @Override
    void evenOrOdd() {
        int num1;
        String result;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number to find Odd or Even");
        num1=ip.nextInt();
        result=(num1%2==0)?"Even Number":"Odd Number";
        System.out.println("The Number is "+result);
    }
    @Override
   public void vowelOrConsonant() {
        char ch;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the character");
        ch=ip.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+"is a vowel");
        }
        else{
            System.out.println(ch+"is a constant");
        }
    }
    @Override
    void toFindLargestNumber() {
        int num1,num2,num3,result;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter Number 1 value");
        num1=ip.nextInt();
        System.out.println("Enter Number 2 value");
        num2=ip.nextInt();
        System.out.println("Enter Number 3 value");
        num3=ip.nextInt();
        result=((num1>num2)&& (num1>num3))?num1:((num2>num3)?num2:num3);
        System.out.println("The largest Number Among 3 numbers is"+result);
    }
    @Override
    void rootsOfQuadraticEquation() {
        double a,b,c,d,r1,r2;
        Scanner ip= new Scanner(System.in);
        System.out.println("Enter the a value to find the root of Quadratic Equation");
        a=ip.nextDouble();
        System.out.println("Enter the b value");
        b=ip.nextDouble();
        System.out.println("Enter the c value");
        c=ip.nextDouble();
        d=b*b-4*a*c;
        r1=-b+Math.sqrt(d)/2*a;
        r2=-b-Math.sqrt(d)/2*a;
        System.out.println("Root 1 value is :"+r1);
        System.out.println("Root2 value is :"+r2);
    }
    @Override
    void positiveOrNegative() {
        int number;
        String s1="";
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number to check whether poitive or negative");
        number=ip.nextInt();
        s1=number>0?"Positive":"Negative";
        System.out.println("The number is "+s1);
    }
    @Override
   public void alphabetOrNot() {
        char ch;
        String s;
        System.out.println("Enter the character");
        Scanner ip=new Scanner(System.in);
        ch=ip.next().charAt(0);
        s=(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')?"is a Alphabet":"is not a Alphabet";
        System.out.println(ch+" "+s);
    }
    @Override
    void sumOfNaturalNumbers() {
        int n,sum=0,num=0,r,max=0;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number to find the sum of natrual Number");
        n=ip.nextInt();
        for(int i=1;i<=n;i=i+1)
        {
            sum=sum+i;
        }
        System.out.println("The sum is"+sum);
        num=sum;
        while(num!=0)
        {
            r=num%10;
            if(max<r)
            {
                max=r;
            }
            num=num/10;
        }
        System.out.println("The largest digit of sum is"+max);
    }
    @Override
    void factorialOfNumber() {
        int fact=1,n,i,sum=0,num,rem;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number to find fact value");
        n=ip.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the given number is"+fact);
        num=fact;
        while(num!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of the digit is"+sum);
    }
}
class NumbersAndAlphabets extends Numbers
{
    public static void main(String[] args) {
        NumbersAndAlphabets na=new NumbersAndAlphabets();
        na.getOption();
    }
}