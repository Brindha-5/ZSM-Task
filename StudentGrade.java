import java.io.*;
import java.util.*;
public class StudentGrade {
    public static void main(String args[])
    {
        int rollNo;
        String Name,Department;
        int tamilMark,englishMark,mathsMark,scienceMark,socialScienceMark,total=0;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter RollNO");
        rollNo=ip.nextInt();
        System.out.println("Enter Name");
        name=ip.nextLine();
        System.out.println("Enter Department");
        department=ip.nextLine();
        System.out.println("Enter TamilMark");
        tamilMark=ip.nextInt();
        System.out.println("Enter EnglishMark");
        englishMark=ip.nextInt();
        System.out.println("Enter MathsMark");
        mathsMark=ip.nextInt();
        System.out.println("Enter ScienceMark");
        scienceMark=ip.nextInt();
        System.out.println("Enter SocialScience Mark");
        socialScienceMark=ip.nextInt();
        total=tamilMark+englishMark+mathsMark+scienceMark+socialScienceMark;
        String result=(total>300?"pass":"Fail")
        System.out.println(result);
    }
}
