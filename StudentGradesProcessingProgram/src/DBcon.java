import java.sql.*;

public class DBcon {


    public Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/new_schema";
        String userName = "root";
        String password = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            return conn;

        } catch (SQLException e) {
            e.getMessage();
        }

        return null;
    }


    public Statement getStatement(Connection conn) {

        try {
            Statement stmt = conn.createStatement();
            return stmt;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
