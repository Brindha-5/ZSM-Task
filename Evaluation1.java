/*
19) Evaluate the following expression on paper and on program and understand the
difference
a+=a++ + ++a + –a + a–; when a=28
 */
package exercise;
public class Evaluation1 {
    void display()
    {
        int a=28;
        a+=a++ + ++a + -a+ a--;
        System.out.println(a);
    }
}
class Evaluate1
{
    public static void main(String[] args) {
        Evaluation1 e=new Evaluation1();
        e.display();
    }
}
