import java.util.ArrayList;

public class EmptyArrayList {
    public static void main(String args[]) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Computer");
        firstList.add("Laptop");
        firstList.add("Keyboard");
        firstList.add("Mouse");
        firstList.add("CPU");
        System.out.println("ArrayList Before Clear");
        System.out.println(firstList);
        firstList.clear();
        System.out.println("ArrayList After Clear");
        System.out.println(firstList);
    }

}
