package ChatbotEx;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class TableCreation {
    void createTable()
    {
        try
        {
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/chatbot","root","Muruga555$");
            System.out.println("Connected Successfully");
            Statement stmt=con.createStatement();
           // String sql="create table Languages(Id int,Col1 varchar(20),col2 varchar(20),col3 varchar(20),col4 varchar(20))";
            //stmt.executeUpdate(sql);
            String sql="create table Recharge(Id int,Col1 varchar(20),col2 varchar(20))";
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
    public static void main(String[] args) {
        TableCreation t=new TableCreation();
        t.createTable();
    }
}
