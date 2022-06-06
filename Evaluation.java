/*
18) Evaluate the following expression on paper and on program and understand the
difference
i) ++a-b–                   ii) a%b++     iii)  a*=b+5               iv) x=69>>>2
 */
package exercise;
public class Evaluation {
    void display()
    {
        int a,x,b,ans1,ans2,ans3;
        a=5;
        b=7;
        ans1=++a-b--;
        ans2=a%b++;
        a*=b+5;
        x=69>>>2;
        System.out.println("1 :"+ans1);
        System.out.println("2 :"+ans2);
        System.out.println("3 :"+a);
        System.out.println("4 :"+x);
    }
}
class Evaluate
{
    public static void main(String[] args) {
        {
            Evaluation e=new Evaluation();
            e.display();
        }
    }
}
