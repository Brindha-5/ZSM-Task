package exercise;
interface StaticDemo
{
    void display();
   static void print()
    {
        System.out.println("Hi... Im a Ststic Method from Interface1");
    }
   default void defaultMethod()
    {
        System.out.println("Hi... Im a default Method from Interface1");
    }
}
interface StaticDemo2
{
    static void print()
    {
        System.out.println("Hi... Im a Ststic Method from Interface2");
    }
    default void defaultMethod1()
    {
        System.out.println("Hi... Im a default Method from Interface2");
    }
}
abstract class StaicAbstract implements StaticDemo{
    int a=5;
  abstract protected void show();

}

abstract public class StaticKeyWord {
static final int a=10;


  /*  @Override
    public void defaultMethod() {
        StaticDemo.super.defaultMethod();
       StaticDemo2.super.defaultMethod();
    }*/
}
class Demo extends StaticKeyWord
{
    final void displaying()
    {

    }
    public static void main(String[] args) {
        Demo s=new Demo()
        {

        };
        StaticDemo.print();
        StaticDemo2.print();

    }

}
