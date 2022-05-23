import java.io.*;
import java.util.*;
public class TrimToSizeAL {
    public static void main(String args[])
    {
        ArrayList<String>firstList=new ArrayList<>();
        firstList.add("Computer");
        firstList.add("Laptop");
        firstList.add("Keyboard");
        firstList.add("Mouse");
        firstList.add("CPU");
        firstList.trimToSize();
        System.out.println(firstList);

    }

}
