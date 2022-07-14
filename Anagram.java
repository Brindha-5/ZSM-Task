import java.util.Scanner;

public class Anagram {
    void toFindAnagrams()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the first String");
        String first=ip.nextLine();
        System.out.println("Enter the second String");
        String second=ip.nextLine();
        char ch1[]=first.toCharArray();
        char ch2[]=second.toCharArray();
        if(first.length()!=second.length())
        {
            System.out.println("Given strings are not anagrams of each other");
        }
        else {
            int count=0;
            for(int i=0;i<first.length();i++)
            {
                for(int j=0;j<second.length();j++)
                {
                    if(ch1[i]==ch2[j])
                    {
                        count++;
                        ch2[j]='*';
                        break;
                    }
                }
            }
            if(count==first.length())
            {
                System.out.println("Given strings are anagrams of each other");
            }
            else {
                System.out.println("Given strings are not anagrams of each other");
            }
        }
    }
    public static void main(String[] args) {
        Anagram am=new Anagram();
        am.toFindAnagrams();
    }
}
