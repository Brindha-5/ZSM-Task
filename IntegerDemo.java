public class IntegerDemo {
    void cacheDemo()
    {
        Integer num1=190;
        Integer num2=190;
        System.out.println("Comparing reference of num1& num2 "+(num1==num2));
        Integer num3=90;
        Integer num4=90;
        System.out.println("Comparing reference of num3& num4 "+(num3==num4));
        Integer num6=new Integer(90);
        Integer num7=new Integer(90);
        System.out.println("Comparing reference of num6& num7 "+(num6==num7));
    }
    public static void main(String args[])
    {
        IntegerDemo obj=new IntegerDemo();
        obj.cacheDemo();
    }

}
