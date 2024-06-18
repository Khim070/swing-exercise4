import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/","root","");
            System.out.println("Success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}