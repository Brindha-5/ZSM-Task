import java.util.*;
public class StringX {
    public static void main(String[] args) {
        String s;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the string");
        s=ip.nextLine();
        int n=s.length();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i==j||i+j==n-1)
                {
                    System.out.print(s.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
