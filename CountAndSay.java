import java.util.*;
public class CountAndSay {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        String s="1";
        int digit=0,n,count=1;
        String newstring="";
        System.out.println("Enter the n value");
        n=ip.nextInt();
        for(int i=1;i<n;i++)
        {
           String next="";
           int j=0;
           while(j<s.length())
           {
               count=1;
               while(j<s.length()-1&&s.charAt(j)==s.charAt(j+1))
               {
                count++;
                j++;
               }
               next=next+count+s.charAt(j);
               j++;
            }
           System.out.println(next);
           s=next;
        }

    }

    public static void main(String[] args) {
        CountAndSay cs=new CountAndSay();
        cs.display();
    }
}
