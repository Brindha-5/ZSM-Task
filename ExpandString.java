import java.util.Scanner;
public class ExpandString {
    void expandString()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter String");
        String s;
        String s1="";
        s=ip.nextLine();
        int n=s.length();
        int i=0;
        while(i<n)
        {
            char ch=s.charAt(i++);
            int count=0;
            while(i<n&&s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
               count=count*10+s.charAt(i++)-'0';
            }
            while(count!=0)
            {
                s1=s1+ch;
                count--;
            }
        }
        System.out.println(s1);
    }
    public static void main(String[] args) {
        ExpandString e=new ExpandString();
        e.expandString();
    }
}
