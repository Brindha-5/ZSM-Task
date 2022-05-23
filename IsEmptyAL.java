import java.util.ArrayList;

public class IsEmptyAL {
        public static void main(String args[]) {
            ArrayList<String> firstList = new ArrayList<>();
            firstList.add("Computer");
            firstList.add("Laptop");
            firstList.add("Keyboard");
            firstList.add("Mouse");
            firstList.add("CPU");
            System.out.println("ArrayList Before Clear");
            System.out.println(firstList);
            System.out.println("Is ArrayList Empty");
            boolean result= firstList.isEmpty();
            System.out.println(result);
            firstList.clear();
            System.out.println("ArrayList After Clear");
            System.out.println(firstList);
            boolean result1= firstList.isEmpty();
            System.out.println("Is ArrayList Empty");
            System.out.println(result1);
        }

    }


