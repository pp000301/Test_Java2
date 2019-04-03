package test_jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class Test_connection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection connection = null;
        connection = DriverManager.getConnection(
                "jdbc:postgresql://hostname:port/postgres@localhost","postgres", "postgres");
        System.out.println("Connected");
        connection.close();
    }
}
