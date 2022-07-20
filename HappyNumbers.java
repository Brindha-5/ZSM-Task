package tuesday_12;

import java.util.Scanner;

public class HappyNumbers {
    void display() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter number");
        int n = ip.nextInt();
        int sum = 0;
        while (sum != 1 && sum != 4)
        {
            sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum = sum + (temp * temp);
            n = n / 10;
        }
        n = sum;
    }
        if(sum==1)
        {
            System.out.println("Happy number");
        }
        else {
            System.out.println("Not a happy number");
        }
    }

    public static void main(String[] args) {
        HappyNumbers s=new HappyNumbers();
        s.display();
    }
}
