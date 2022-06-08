import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEven {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList();
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=ip.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            a.add(ip.nextInt());
        }
        for(int i=0;i<n;i++)
        {
           if(a.get(i)%2==0)
           {
               a.remove(i);
               i=i-1;
               n=n-1;

           }
        }
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }


    }
}
