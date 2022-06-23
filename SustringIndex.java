import java.util.*;
public class SustringIndex {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter the first string");
        s1=ip.nextLine();
        System.out.println("Enter the second String");
        s2=ip.nextLine();
        int a=s1.indexOf(s2);
        System.out.println(a);
    }
}
