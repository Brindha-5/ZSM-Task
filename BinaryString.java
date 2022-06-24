import java.util.Scanner;
public class BinaryString {
    void toBinary()
    {
        int i;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number");
        i=ip.nextInt();
        String s=Integer.toBinaryString(i);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s2=sb.toString();
        if(s.equals(s2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String[] args) {
        BinaryString bs=new BinaryString();
        bs.toBinary();
    }
}

