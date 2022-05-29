import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StudentMap {
    static HashMap<Integer,StudentDetails> Student =new HashMap<>();
    public static void main(String[] args) {



        Student.put(1,new StudentDetails(101, 18, "Brindha", "Female", "MCA", "bs@gmail.com", 996732773));
        Student.put(2,new StudentDetails(102, 26, "Akil", "Male", "BE", "ak@gmail.com", 987732773));
        Student.put(3,new StudentDetails(103, 23, "Shiva", "Female", "BTECH", "shiv@gmail.com", 766732773));
        Student.put(4,new StudentDetails(104, 24, "Guna", "Female", "BCA", "guna@gmail.com", 996732673));
        Student.put(5,new StudentDetails(105, 25, "Kalai", "Female", "BSC", "kalai@gmail.com", 876732773));
      /* Iterator trav=Student.entrySet().iterator();
        while(trav.hasNext())
        {
            Map.Entry record=(Map.Entry)trav.next();
            StudentDetails s=(StudentDetails)record.getValue();
            System.out.println(record.getKey(),s.getRollNo(),s.getName(),s.getGender(),s.getAge(),s.getDepartment(),s.getPhoneNo(),s.getEmailId());
        }
for(Integer o:Student.keySet())
{
   System.out.println(Student.get(o).getRollNo(), Student.get(o).getName(), Student.get(o).getAge(), Student.get(o).getGender(), Student.get(o).getDepartment(), Student.get(o).getEmailId(), Student.get(o).getPhoneNo());
}*/
        Scanner ip=new Scanner(System.in);
        System.out.println(Student);
        System.out.println("Enter the choice to proceed");
        int choice=ip.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println(Student);
                System.out.println("The Size of the Student MAp is"+Student.size());
                break;
            case 2:
                HashMap<Integer, StudentDetails> Copy=new HashMap<>();
                Copy=Student;
                System.out.println("The copy of Student map is");
                System.out.println(Copy);
                break;
            case 3:
                System.out.println(Student);
                Student.clear();
                System.out.println("After Removing Elements in Map");
                System.out.println(Student);
                break;
            case 4:
                System.out.println("Map is Empty or not");
                if(Student.isEmpty())
                {
                    System.out.println("Map is Empty");
                }
                else
                {
                    System.out.println("Map is not Empty");
                }
                break;
            case 5:
                System.out.println("The Details in Student Map");
                System.out.println(Student);
                HashMap<Integer, StudentDetails> clone=(HashMap<Integer, StudentDetails>)Student.clone();
                System.out.println("The Details in Clone Map");
                System.out.println(clone);
                clone.get(1).setName("ASHOK");
                System.out.println(Student);
                System.out.println(clone);
break;
        }


    }
}
