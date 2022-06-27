import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;
//import java.util.stream.Node;
public class PriorityQueueDemo {
    public static Comparator<OfficeFiles> comp = new Comparator<OfficeFiles>() {
        @Override
        public int compare(OfficeFiles t1, OfficeFiles t2) {
            return (int) t1.getCount() - t2.getCount();
        }
    };
    PriorityQueue<OfficeFiles> que = new PriorityQueue<>(5, comp);
    void getInput() {
        Scanner ip = new Scanner(System.in);
       File file=new File("C:\\Users\\naven\\Desktop\\Priority");
       String list[]=file.list();
       for (int i=0;i<list.length;i++)
       {
           System.out.println(list[i]);
       }
       System.out.println("Files inside the Folder");
       for(int i=0;i<list.length;i++) {
           int count=0;
          // System.out.println("hi");
           try {
               File f = new File("C:\\Users\\naven\\Desktop\\Priority\\"+list[i]);
               FileReader fr=new FileReader(f);
               String result="";
               //String line = ip.nextLine();
               int output=fr.read();
               while (output!=-1) {

                   //System.out.println(line);
                   //result=result+line;
                  // line = ip.next();
                   result=result+(char)output;
                   count++;
                   output=fr.read();
               }
               que.add(new OfficeFiles(count,result));
           }
           catch(Exception e)
           {
           System.out.println("Exception e");
           }
       }
    }
    void display() {
        while (true) {
            OfficeFiles f = que.poll();
            if (f == null) break;
            System.out.println("____________________________________________________________________________________________");
            System.out.println("Character Count is " + f.getCount() + " content of the File is  " + f.getFilecontent());
        }
    }
    public static void main(String[] args) {
        PriorityQueueDemo p=new PriorityQueueDemo();
        p.getInput();
        p.display();
    }
}




