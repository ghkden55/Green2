import java.sql.*;
import java.util.Scanner;

public class DeleteTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DBcon dBcon = new DBcon();

        System.out.println("삭제할 학생의 번호를 입력하세요.");
        int sno = sc.nextInt();

        try {
            String sql = "DELETE FROM tbl_students WHERE sno = ?";

            Connection conn = dBcon.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, sno);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
