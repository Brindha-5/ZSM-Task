import java.util.*;
public class QueueDemo {
    void interviewProcess()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Welcome to XYZ Technologies");
        System.out.println("Interview Process");
        System.out.println("Only 3 persons are allowed to inside the Interview Hall..." +
                "\n Remaining will be waited outside the Inteview HAll " +
                "\n if one  among three, completes his interview then next person will allowed to enter inside the " +
                "interview hall from waiting hall ");
        System.out.println("Enter the Number of people going to attend interview today");
        int number=ip.nextInt();
        Queue<String> que=new LinkedList<>();
        //System.out.println(que.size());
       for(int i=1;i<=number;i++)
       {
           System.out.println("Enter Candidate name to attend whose candidate id is "+ i);
           String name=ip.next();
           if(que.size()<3) {
               que.add(name);
           }
           else {
               System.out.println(name + "    please wait outside the interview hall..\n Already Three Members are there");
               if (que.size()==3) {
                   System.out.println("_______________");
                   System.out.println(que.poll() + " is completed his/her Interview");
                   System.out.println(name + "  Please enter inside the waiting Hall");
                   que.add(name);
                   System.out.println("_____________");
               }
           }
        }
    }

    public static void main(String[] args) {
        QueueDemo q=new QueueDemo();
        q.interviewProcess();
    }
}

