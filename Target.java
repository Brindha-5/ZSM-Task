import java.util.*;
public class Target {
    public static void main(String[] args) {
        int i,j,n,k=0;
        int count=0;
        int a[]=new int[10];
        int result[]=new int[10];
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        n=ip.nextInt();
        System.out.println("Enter the Elements");
        for(i=0;i<n;i++)
        {
         a[i]=ip.nextInt();
        }
        System.out.println("Enter the target");
        int d=ip.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(a[i]+a[j]==d)
                {
                    result[k++]=i;
                    result[k++]=j;
                    count=count+2;
                }
            }
        }
        for(i=0;i<count;i++) {
        System.out.println(result[i]);
        }
    }
}
