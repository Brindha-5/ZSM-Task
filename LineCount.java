package basics;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class LineCount {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\naven\\Desktop\\FileDemo\\Demo.txt");
        int count=0;
        Scanner ip=new Scanner(f);
        while(ip.hasNextLine())
        {
            ip.nextLine();
            count++;
        }
        System.out.println("No of Lines in the file is  :"+count);
    }
}

