import java.util.ArrayList;

public class MergeTwoAL {
    public static void main(String args[]) {
        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();
        firstList.add("Computer");
        firstList.add("Laptop");
        firstList.add("Keyboard");
        firstList.add("Mouse");
        firstList.add("CPU");
        System.out.println(firstList);
        secondList.add("Computer");
        secondList.add("Laptop");
        secondList.add("Keyboard");
        secondList.add("Mouse");
        secondList.add("CPU");
        System.out.println(secondList);
        firstList.addAll(secondList);
        System.out.println("After Joining two ArrayList");
        System.out.println(firstList);
    }
    }
