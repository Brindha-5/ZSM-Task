import java.util.Scanner;

public class PrimeFibbonnci {
    static int count1=0;
    void display() {
        int n = 0, n1 = 1;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the n value");
       while(true) {
           int t = n + n1;
           n = n1;
           n1 = t;
           isPrime(n);
       }
    }
    void isPrime(int x) {
        if (x >= 2) {
            int count = 0;
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(x+ " is Fibboncci cum Prime number " );
                count1++;
                if(count1==10)
                {
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        PrimeFibbonnci fb = new PrimeFibbonnci();
        fb.display();
    }
}
