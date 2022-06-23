import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
       String str,result="";
       Scanner ip=new Scanner(System.in);
       System.out.println("Enter the String");
       str=ip.nextLine();
       int n=str.length();
       int sum=0;
       int i=0;
       while(i<n)
       {
           char ch=str.charAt(i++);
           while(i<n&&str.charAt(i)>='0'&&str.charAt(i)<='9')
           {
              sum=sum*10+str.charAt(i++)-'0';
           }
           while(sum>0)
           {
               result=result+ch;
               sum--;
           }
       }
       System.out.println(result);

    }
}
