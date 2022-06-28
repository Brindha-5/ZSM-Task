package ChatbotEx;
import java.sql.*;
public class TableDataInsertion {
    void insert() throws SQLException {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatbot", "root", "Muruga555$");
            //System.out.println("Connected Successfully");
            //String sql="insert into Languages values(1,'1.Recharge','2.Caller_Tune','3.DTH','4.New Offer')";
            // PreparedStatement smt=con.prepareStatement(sql);
            // smt.executeUpdate();
            //  String sql="insert into Languages values(1,'1.\"ரேச்சர்ஜ்\"','2.காலர் டியுன்','3.டிதிஹ்','4.நியூ ப்ளன்')";
            // PreparedStatement smt=con.prepareStatement(sql);
            //  smt.executeUpdate();
            // String sql="insert into Languages values(3,'1.Recharge','2.Caller_Tune','3.DTH','4.New Offer')";
            // PreparedStatement smt=con.prepareStatement(sql);
            //smt.executeUpdate();
            String sql = "insert into Recharge values(3,'1.Airtel Recharge','2.Coupon Recharge')";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.executeUpdate();
            smt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void dataDisplay(int sv, int size, int lang) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatbot", "root", "Muruga555$");
            Statement smt = con.createStatement();
            int value = sv;
            if (size == 0) {
                System.out.println("Select Language");
                System.out.println("1. English");
                System.out.println("2. Tamil");
                System.out.println("3. Telugu");
                System.out.println("0. Exit");
            } else if (size == 1) {
                String sql = "select * from languages where id =" + sv;
                ResultSet rs = smt.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                    System.out.println(rs.getString(4));
                    System.out.println(rs.getString(5));
                }
            } else if (size == 2) {
                if (sv == 1) {
                    String sql = "select * from Recharge where id =" + lang;
                    ResultSet rs = smt.executeQuery(sql);
                    //rs.absolute(value);
                    while (rs.next()) {
                        System.out.println(rs.getString(2));
                        System.out.println(rs.getString(3));
                    }
                } else if (sv == 2) {
                    String sql = "select * from Callertune where id =" + lang;
                    ResultSet rs = smt.executeQuery(sql);
                    //rs.absolute(value);
                    while (rs.next()) {
                        System.out.println(rs.getString(2));
                        System.out.println(rs.getString(3));
                        System.out.println(rs.getString(4));
                        System.out.println(rs.getString(5));
                    }
                } else if (sv == 3) {
                    String sql = "select * from DTH where id =" + lang;

                    ResultSet rs = smt.executeQuery(sql);
                    //rs.absolute(value);
                    while (rs.next()) {
                        System.out.println(rs.getString(2));
                        System.out.println(rs.getString(3));
                        System.out.println(rs.getString(4));
                    }
                } else if (sv == 4) {
                    String sql = "select * from NewPlan where id =" + lang;

                    ResultSet rs = smt.executeQuery(sql);
                    //rs.absolute(value);
                    while (rs.next()) {
                        System.out.println(rs.getString(2));
                        System.out.println(rs.getString(3));
                    }
                }
            }
            smt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
