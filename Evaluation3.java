/*
Evaluate the following expression on paper and on program and understand the
difference
If int y = 10 then find int z = (++y * (y++ + 5));
 */
package exercise;
public class Evaluation3 {
    void display()
    {
        int y,z;
        y=10;
        System.out.println("Y value is :"+y);
        z=(++y*(y++ + 5));
        System.out.println("z=(++y*(y++ + 5))");
        System.out.println("Z value is "+z);
    }
}
class Evaluate3
{
    public static void main(String[] args) {
        Evaluation3 e=new Evaluation3();
        e.display();
    }
}
