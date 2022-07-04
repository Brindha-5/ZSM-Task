import java.util.*;
public class PrimeNumber {
    void printPrimeNumber() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int startNumber = ip.nextInt();
        System.out.println("Enter the end number");
        int endNumber = ip.nextInt();
        System.out.println("The prime numbers from " + startNumber + " to " + endNumber + ":");
        int newLine = 10;
        if (startNumber < 2) {
            startNumber = 2;
        }
        for (int i = startNumber; i <= endNumber; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (newLine < i) {
                System.out.println();
                newLine *= 10;
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        p.printPrimeNumber();
    }
}
