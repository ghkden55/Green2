package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Member;

public class MemberDao {
	
	private Connection conn = DBcon.getConnection();
	private PreparedStatement stmt;
	private ResultSet rs;
	private int result;
	
	// 로그인 처리
	public int loginCheck(String id, String pw) {
		String query = "SELECT COUNT(*) AS cnt FROM member WHERE id = ? AND pw = ?";
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1,id);
			stmt.setString(2,pw);
			
			rs = stmt.executeQuery();
			
			rs.next();
			result = rs.getInt("cnt");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	// 회원 등록
	public int registMember(Member member) {
		String query = "INSERT INTO member VALUES (?, ?, ?)";
		
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, member.getId());
			stmt.setString(2, member.getPw());
			stmt.setString(3, member.getName());
			
			result = stmt.executeUpdate();
			
			if (result == 1) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 회원 탈퇴	
	
	// 회원 조회
	
	// 회원 전체 조회
	
	// 회원 정보 수정
	public int modifyMember(Member member) {
		String query = "UPDATE member SET pw = ?, name = ? WHERE id = ?";
		
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1,  member.getPw());
			stmt.setString(2,  member.getName());
			stmt.setString(3,  member.getId());
			
			result = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
