/* 6) Write a program for the following. Let consider 20 students in a class with the roll no
101-120. We are going to split them into four groups. Based on their roll number we are
going to split them with the following logics. */
package exercise;
import java.util.Scanner;
public class StudentGroup {
    void noOfStudents()
    {
        int students;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the no of students");
        students=ip.nextInt();
        studentDisplay(students);
    }
    void studentDisplay(int students)
    {
        int rollnum=100,k;
        k=students/4;
        int group1[]=new int[100],group2[]=new int[100],group3[]=new int[100],group4[]=new int[100];
        for(int i=1;i<=k;i++) {
            group1[i] = rollnum + 1;
            group2[i] = rollnum + 2;
            group3[i] = rollnum + 3;
            group4[i] = rollnum + 4;
            rollnum = group4[i];
        }
        System.out.println("Group 1 Students");
            for( int i=1;i<=k;i++)
            {
                System.out.println(group1[i]);
            }
            System.out.println("Group 2 Students");
            for( int i=1;i<=k;i++)
            {
                System.out.println(group2[i]);
            }
            System.out.println("Group 3 Students");
            for(int i=1;i<=k;i++)
            {
                System.out.println(group3[i]);
            }
            System.out.println("Group 4 Students");
            for( int i=1;i<=k;i++)
            {
                System.out.println(group4[i]);
            }
        }
    }
class ClassStudent
{
    public static void main(String[] args) {
        StudentGroup object = new StudentGroup();
        object.noOfStudents();
    }
}
