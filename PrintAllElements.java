import java.util.ArrayList;

public class PrintAllElements {
    public static void main(String args[]) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Computer");
        firstList.add("Laptop");
        firstList.add("Keyboard");
        firstList.add("Mouse");
        firstList.add("CPU");
        for (int i = 0; i < firstList.size(); i++) {
            System.out.println(firstList.get(i));
        }
    }
}
