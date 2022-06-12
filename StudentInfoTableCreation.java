package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentInfoTableCreation {
    public static void main(String[] args) {
        try
        {
         String url="jdbc:mysql://localhost:3306/student";
         String username="root";
         String pwd="Muruga555$";
         Connection con= DriverManager.getConnection(url,username,pwd);
         System.out.println("Connected Successfully");
            Statement stmt=con.createStatement();
            String sql="create table StudentInfo(RollNo int not null,Name varchar(20),Age int,Gender varchar(20),Department varchar(10),EmailId varchar(30),PhoneNo int)";
            stmt.executeUpdate(sql);
            System.out.println("Table Created");
            stmt.close();
            con.close();
        }
        catch(Exception ex)
        {
System.out.println("Not Connected");
ex.printStackTrace();
        }
    }
}
