import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class SwapTwoEllements {
    public static void main(String args[]) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Computer");
        firstList.add("Laptop");
        firstList.add("Keyboard");
        firstList.add("Mouse");
        firstList.add("CPU");
        System.out.println("Before Swapping");
        System.out.println(firstList);
        System.out.println("After Swapping");
        Collections.swap(firstList,1,2);
        System.out.println(firstList);

    }

}
