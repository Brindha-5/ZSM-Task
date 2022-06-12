package jdbcconnection;
import java.sql.*;
import java.util.Scanner;
public class StudentManagement {
    Scanner ip=new Scanner(System.in);
    void getOption() {
        System.out.println("***********Welcome to ZOHO Schoools**************");
        int condition=0;
        do {
            System.out.println("Enter your Choice");
            System.out.println("1.Register Student Details");
            System.out.println("2.View Student Details");
            System.out.println("3.Update Student Details");
            System.out.println("4.Delete Student detail based on RollNo");
            int choice = ip.nextInt();
            switch (choice) {
                case 1:
                    insertStudentInfo();
                    break;
                case 2:
                    viewStudentInfo();
                    break;
                case 4:
                    deleteStudentInfo();
                    break;
                case 3:
                    updateStudentInfo();
                    break;
                default:
                    System.out.println("Enter Correct Choice");
            }
            System.out.println("Do you want to Continue .. if yes Press 1");
             condition=ip.nextInt();
        }while(condition==1);
    }
    void insertStudentInfo()
    {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String pwd = "Muruga555$";
            Connection con = DriverManager.getConnection(url, username, pwd);
            int rollno,age,ph;
            String name,gender,department,mailid;
            System.out.println("Enter RollNumber");
            rollno=ip.nextInt();
            ip.nextLine();
            System.out.println("Enter Name");
            name=ip.nextLine();
            System.out.println("Enter Age");
            age=ip.nextInt();
            ip.nextLine();
            System.out.println("Enter Gender:");
            gender=ip.nextLine();
            System.out.println("Enter Department");
            department=ip.nextLine();
            System.out.println("Enter EmailId");
            mailid=ip.nextLine();
            System.out.println("Enter Phonenumber");
            ph=ip.nextInt();
            String sql="insert into StudentInfo values(?,?,?,?,?,?,?)";
            PreparedStatement smt=con.prepareStatement(sql);
            smt.setInt(1,rollno);
            smt.setString(2,name);
            smt.setInt(3,age);
            smt.setString(4,gender);
            smt.setString(5,department);
            smt.setString(6,mailid);
            smt.setInt(7,ph);
            smt.executeUpdate();
            System.out.println("Inserted Successfully");

            //smt.executeUpdate(sql);
            smt.close();
            con.close();
        }
        catch(Exception e)
        {
           System.out.println("Please check your input");
        }
    }
    void viewStudentInfo() {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String pwd = "Muruga555$";
            Connection con = DriverManager.getConnection(url, username, pwd);
            Statement smt=con.createStatement();
            String sql="select * from StudentInfo";
            ResultSet rs=smt.executeQuery(sql);
            while(rs.next())
            {
                int rollno=rs.getInt(1);
                String name=rs.getString(2);
                int age=rs.getInt(3);
                String gender=rs.getString(4);
                String department=rs.getString(5);
                String mailid=rs.getString(6);
                int ph=rs.getInt(7);
                System.out.println(rollno+"\t"+name+"\t"+age+"\t"+gender+"\t"+department+"\t"+mailid+"\t"+ph);
            }
            rs.close();
            smt.close();
            con.close();
        }
        catch(Exception e)
        {
         System.out.println(e);
        }
    }
    void deleteStudentInfo() {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String pwd = "Muruga555$";
            Connection con = DriverManager.getConnection(url, username, pwd);
            String sql="delete from StudentInfo where RollNo=?";
            System.out.println("Enter RollNo to Delete particular Student Detail");
            int rollno=ip.nextInt();
          //  String sql1="select exists(select * from StudentInfo where RollNo=?)";
          //  PreparedStatement ps1=con.prepareStatement(sql1);
           // ps1.setInt(1,rollno);
            //int count=ps1.executeUpdate();
         //   if(count!=0) {

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, rollno);
                int i=ps.executeUpdate();
                if(i!=0) {
                    System.out.println("Deleted Successfully");
                }
                else {
                    System.out.println("RollNumber does not exists");
                }
          //  }
          //  else {

          //  }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    void updateStudentInfo() {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String pwd = "Muruga555$";
            Connection con = DriverManager.getConnection(url, username, pwd);
            String name,dept,email;
            int rollno,phno,ch;
            System.out.println("Enter your choice");
            System.out.println("1.To Update Name");
            System.out.println("2.To Update Department");
            System.out.println("3.To Update Email Id");
            System.out.println("4.To Update Phone Number");
            ch=ip.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter Roll Number to Update the name");
                    rollno=ip.nextInt();
                    ip.nextLine();
                    System.out.println("Enter new Name to update");
                    name=ip.nextLine();
                    String sql="update StudentInfo set Name=? where Rollno=?";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);
                    ps.setInt(2,rollno);
                    int count=ps.executeUpdate();
                    if(count!=0) {
                        System.out.println("Updated Successfully");
                    }
                    else {
                        System.out.println("Roll number does not exists");
                    }
                    break;
                case 2:
                    System.out.println("Enter Roll Number ");
                    rollno=ip.nextInt();
                    ip.nextLine();
                    System.out.println("Enter new Department to update");
                    dept=ip.nextLine();
                    String sql1="update StudentInfo set Department=? where Rollno=?";
                    PreparedStatement ps1=con.prepareStatement(sql1);
                    ps1.setString(1,dept);
                    ps1.setInt(2,rollno);
                    int count1=ps1.executeUpdate();
                    if(count1!=0) {
                        System.out.println("Updated Successfully");
                    }
                    else {
                        System.out.println("Roll number does not exists");
                    }
                    break;
                case 3:
                    System.out.println("Enter Roll Number ");
                    rollno=ip.nextInt();
                    ip.nextLine();
                    System.out.println("Enter new Emailid to update");
                    email=ip.nextLine();
                    String sql2="update StudentInfo set EmailId=? where Rollno=?";
                    PreparedStatement ps2=con.prepareStatement(sql2);
                    ps2.setString(1,email);
                    ps2.setInt(2,rollno);
                    int count2=ps2.executeUpdate();
                    if(count2!=0) {
                        System.out.println("Updated Successfully");
                    }
                    else {
                        System.out.println("Roll number does not exists");
                    }
                    break;
                case 4:
                    System.out.println("Enter Roll Number ");
                    rollno=ip.nextInt();
                    System.out.println("Enter new Phone number to update");
                    phno=ip.nextInt();
                    String sql3="update StudentInfo set PhoneNo=? where Rollno=?";
                    PreparedStatement ps3=con.prepareStatement(sql3);
                    ps3.setInt(1,phno);
                    ps3.setInt(2,rollno);
                    int count3=ps3.executeUpdate();
                    if(count3!=0) {
                        System.out.println("Updated Successfully");
                    }
                    else {
                        System.out.println("Roll number does not exists");
                    }
                default :
                    System.out.println("Please check the choice that you have Entered");
            }
        }
        catch(Exception e) {
        System.out.println(e.getMessage());
        }
        }
    public static void main(String[] args) {
        StudentManagement sm=new StudentManagement();
        sm.getOption();
    }
}
