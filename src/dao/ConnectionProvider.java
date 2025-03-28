package dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pharmacy?useSSL=false",
                "root",
                "tarun" //put the password that you have made in mysql server
            );
            return con;
        } catch (Exception e) { 
            System.out.println(e);
            return null;
        }
    }
}
