import java.sql.*;
import java.util.Scanner;

public class InsertTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DBcon dBcon = new DBcon();

        System.out.println("학생의 정보를 입력해주세요.");
        System.out.println("이름, 나이, 성별");

        String name = sc.next();
        int age = sc.nextInt();
        String gender = sc.next();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            String sql = "INSERT INTO tbl_students(name, age, gender) VALUES (?, ?, ?)";

            Connection conn = dBcon.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, gender);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
