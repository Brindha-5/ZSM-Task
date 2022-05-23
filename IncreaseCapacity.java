import java.util.ArrayList;

public class IncreaseCapacity {
    public static void main(String args[]) {
        ArrayList<String> firstList = new ArrayList<>(5);
        ArrayList<String> secondList = new ArrayList<>();
        firstList.add("Computer");
        firstList.add("Laptop");
        firstList.add("Keyboard");
        firstList.add("Mouse");
        firstList.add("CPU");
        firstList.ensureCapacity(15);
        System.out.println(firstList);

    }
}
