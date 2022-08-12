interface One
{
    default void display()
    {
        System.out.println("This is Interface one's display method");
    }
}
interface Two
{
    default void display()
    {
        System.out.println("This is Interface Two's display method");
    }
}

public class DefaultMethodInInterface implements One,Two {
    public static void main(String args[])
    {
DefaultMethodInInterface obj=new DefaultMethodInInterface();
obj.display();
    }
    @Override
    public void display() {
System.out.println("This is Class Display method");
One.super.display();
Two.super.display();
    }
}