import java.sql.*;

public class aaa {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","");
        if (con == null)
            System.out.println("connection not done");
        else
            System.out.println("connection done");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from stu");
        while(rs.next())
        {
            System.out.println(rs.getString(1));
            System.out.println(rs.getInt(2));
            System.out.println(rs.getInt(3));
        }
    }
}
