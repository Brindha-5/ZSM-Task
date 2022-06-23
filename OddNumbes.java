import java.util.*;
public class OddNumbes {
    public static void main(String[] args) {
        int first,last;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the first number");
        first=ip.nextInt();
        System.out.println("Enter the second Number");
        last=ip.nextInt();
        for(int i=first;i<last;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
