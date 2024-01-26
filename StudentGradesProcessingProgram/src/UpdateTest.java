import java.sql.*;
import java.util.Scanner;

public class UpdateTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DBcon dBcon = new DBcon();

        System.out.println("수정할 학생의 번호를 입력하세요.");
        int sno = sc.nextInt();

        System.out.println("변경할 정보를 입력하세요.");
        System.out.println("이름, 나이, 성별");

        String name = sc.next();
        int age = sc.nextInt();
        String gender = sc.next();

        try {
            String sql = "UPDATE tbl_students SET name = ?, age = ?, gender = ? WHERE sno = ?";

            Connection conn = dBcon.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, gender);
            pstmt.setInt(4, sno);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
