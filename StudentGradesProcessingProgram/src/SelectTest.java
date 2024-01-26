import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SelectTest {
    public static void main(String[] args) {

        DBcon dBcon = new DBcon();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            String sql = "SELECT * FROM tbl_students";

            Connection conn = dBcon.getConnection();
            Statement stmt = dBcon.getStatement(conn);
            ResultSet rs = stmt.executeQuery(sql);
            List<Student> students = new ArrayList<>();

            while (rs.next()) {

                Student stud = new Student();

                stud.setSno(rs.getInt("sno"));
                stud.setName(rs.getString("name"));
                stud.setAge(rs.getInt("age"));
                stud.setGender(rs.getString("gender"));

                students.add(stud);
            }

            for (Student stud : students) {
                System.out.println(stud.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
