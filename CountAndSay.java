import java.util.*;
public class CountAndSay {
    public static void main(String[] args) {
        String str="1";
        int n,count=1;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the count");
        n=ip.nextInt();

        for(int i=0;i<n;i++) {
            int j = 0;
            String newstring = "";
            while (j < str.length()) {
                count=1;
                while (j < str.length() - 1 && str.charAt(j) == str.charAt(j + 1)) {
                    count++;
                    j++;
                }
                newstring = newstring + count + str.charAt(j);
                j++;
            }
            str=newstring;
        }
        System.out.println(str);
    }
}
