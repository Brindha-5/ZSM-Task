import java.util.Scanner;

public class StringDemo {
    void doDemo()
    {
       // Scanner ip=new Scanner(System.in);
        //System.out.println("Enter the String");
        String str1=new String("Hello");
        String str2=new String("Hello");
        System.out.println("Comparing String1 with string 2 (Reference Comparision)  "+(str1==str2));//comparing the reference value
        System.out.println("Comparing String1 with string 2 (Value Comparision)  "+(str1.equals(str2)));//comparing the value
        String s1="Hi";
        String s2="Hi";
        System.out.println("Comparing String s1 with string s2 (Reference Comparision)  "+(s1==s2));//comparing the reference value
        System.out.println("Comparing String s1 with string s2 (Value Comparision)  "+(s1.equals(s2)));
        String s3=new String("Hi");
        System.out.println("Comparing String s1 with string s3 (Reference Comparision)  "+(s1==s3));
        String s4=new String("Hi").intern();
        System.out.println("Comparing String s1 with string s4 (Reference Comparision)  "+(s1==s4));
    }
    public static void main(String args[]){
        StringDemo obj=new StringDemo();
        obj.doDemo();
    }
}
