package test;

import dao.DBcon;
import java.sql.Connection;

public class TestDBcon {
	public static void main(String[] args) {
		
		Connection conn = DBcon.getConnection();
		
		if (conn != null) {
			System.out.println("연결 성공");
		} else {
			System.out.println("연결 실패");
		}
		
	}
}
