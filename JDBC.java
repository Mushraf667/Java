import java.sql.*;
public class JDBC 
{
public static void main(String[] args) 
{
    String url = "jdbc:mysql://localhost:3306/student";
    String username = "root";
    String password = "root";
    try 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Statement s = con.createStatement();
        String query = "select * from details";
        ResultSet rs = s.executeQuery(query);
        while(rs.next())
            {
                int s_no = rs.getInt("s_no");
                String Name = rs.getString("Name");
                String Department = rs.getString("Department");
                System.out.println(s_no+" "+Name+" "+Department);
            }
            rs.close();
            s.close();
            con.close();    
    } catch (Exception e) 
    {
        System.out.println(e.getMessage());
    }
}
}