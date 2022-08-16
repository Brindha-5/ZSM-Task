import java.util.*;
public class ListDemo {
    public static void main(String args[])
    {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        modify(l1);
        System.out.println("THe values in ArrayList");
        System.out.println(l1);
    }
    static void modify(ArrayList<Integer> list)
    {
        list.add(25);
        list.add(40);
    }
}
