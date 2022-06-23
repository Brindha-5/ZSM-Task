public class LPattern {
    static int a=10;
    int b=10;
    void dispaly()
    {
        int k=a+b;
    }
    static void run()
    {
       // int s=b;
    }
    public static void main(String[] args) {
        LPattern l=new LPattern();
        run();
        int n=5;
        int c=a+l.b;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                {
                  System.out.print("*");
                }
               System.out.println();
        }
    }
}
