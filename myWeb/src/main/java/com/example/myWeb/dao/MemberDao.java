package com.example.myWeb.dao;

import com.example.myWeb.dto.MemberDto;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class MemberDao {

    private Connection conn = DBcon.getConnection();
    private PreparedStatement stmt;
    private ResultSet rs;
    private int result = 0;


    // 회원 가입
    public int regist(MemberDto memberDto) {
        String query = "INSERT INTO member VALUES (?, ?, ?, 'MEMBER')";

        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1, memberDto.getId());
            stmt.setString(2, memberDto.getPw());
            stmt.setString(3, memberDto.getName());

            result = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            closeResources();
        }

        return result;
    }


    // 아이디 중복 확인
    // SELECT COUNT(*) AS cnt FROM member WHERE id = 'aaa';
    public int idCheck(String id) {
        String query = "SELECT COUNT(*) AS cnt FROM member WHERE id = ?";

        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            rs = stmt.executeQuery();
            rs.next();
            result = rs.getInt(1);

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            closeResources();
        }

        return result;
    }


    // 로그인
    public MemberDto login(String id, String pw) {
        String query = "SELECT * FROM member WHERE id = ? AND pw = ?";
        MemberDto memberDto = new MemberDto();

        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.setString(2, pw);
            rs = stmt.executeQuery();
            rs.next();

            String userId = rs.getString("id");
            String userName = rs.getString("name");
            String userRole = rs.getString("role");

            memberDto = new MemberDto(userId, "", userName, userRole);

        } catch (SQLException e) {
            return null;

        } finally {
            closeResources();
        }

        return memberDto;
    }


    // stmt 객체 사용 후 종료 메서드
    private void closeResources() {
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
