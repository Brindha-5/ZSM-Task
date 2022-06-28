package ChatbotEx;
import java.util.*;

public class StackMain {
    TableDataInsertion tb=new TableDataInsertion();
    Scanner ip=new Scanner(System.in);
    static Stack<Integer> stackdemo =new Stack<>();
    void display() {
        boolean flag = true;
        int lang=0;
        while (flag) {
            int sv = 0;
            int size=stackdemo.size();

           if(stackdemo.size()==0) {
               tb.dataDisplay(0, 0,lang);
               System.out.println("Enter your choice");
               int ch=ip.nextInt();
               if(ch==0)
               {
                   flag=false;
               }
               else if(ch<4&&ch>0)
               {
                   stackdemo.push(ch);
                   lang=ch;
               }
               else
               {
                   System.out.println("Enter valid choice");
               }

           }
           else{
                sv=stackdemo.peek();
                size=stackdemo.size();
                tb.dataDisplay(sv, size,lang);
                System.out.println("9.Back");
                System.out.println("0.Exit");
                int ch = ip.nextInt();
               if(ch==0)
               {
                   flag=false;
               }
               else if(ch==9)
               {
                   stackdemo.pop();
               }
               else if(ch>=1&&ch<=4)
               {
                   stackdemo.push(ch);
                   if(size==2)
                   {
                       System.out.println("****   Activated    ****");
                   }
               }

            }

        }
    }
}
