import java.io.*;
import java.util.*;
public class CompareTwoAL {
    public static void main(String args[])
    {
        ArrayList<String>firstList=new ArrayList<>();
        ArrayList<String>secondList=new ArrayList<>();
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
        boolean result=firstList.equals(secondList);
        System.out.println(result);
        firstList.add("Monitor");
        boolean result1=firstList.equals(secondList);
        System.out.println(result1);

    }
}

