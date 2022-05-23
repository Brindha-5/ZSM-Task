import java.util.ArrayList;

public class ArralyListClone {
    public static void main(String args[]) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Computer");
        firstList.add("Laptop");
        firstList.add("Keyboard");
        firstList.add("Mouse");
        firstList.add("CPU");
        System.out.println(firstList);
        ArrayList secondList = new ArrayList();
        secondList = (ArrayList) firstList.clone();
        System.out.println("The Second ArrayList is");
        System.out.println(secondList);
    }
}
