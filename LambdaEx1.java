interface A
{
    void sayHello();
}
interface B
{
    void addTwoNumbers(int num1,int num2);
}
interface C
{
    void displayNumber(int num);
}
interface D
{
    int numbers(int num1,int num2);
}
public class LambdaEx1 {
    public static void main(String args[])
    {
        A ob1=()-> System.out.println("Hello");
        ob1.sayHello();
        B ob2=(num1, num2) -> System.out.println("AddTwoNumbers "+(num1+num2));
        ob2.addTwoNumbers(10,20);
        C ob3=num-> System.out.println("Display Number "+num);
        ob3.displayNumber(50);
        D ob4=(num1,num2)->num1+num2;
        System.out.println("The additon of two numbers"+ob4.numbers(10,20));
    }
}
