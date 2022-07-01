import java.util.*;
public class StringComparision {
    void toCompare()
    {
    Scanner ip=new Scanner(System.in);
    String s[]=new String[10];
    System.out.println("Enter the number of strings");
    int n=ip.nextInt();
    for(int i=0;i<n;i++)
    {
        s[i]=ip.next();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(s[i].compareTo(s[j])>0)
            {
                String temp=s[i];
                s[i]=s[j];
                s[j]=temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        System.out.println(s[i]);
    }
    }
    public static void main(String[] args) {
        StringComparision sc=new StringComparision();
        sc.toCompare();

    }
}
