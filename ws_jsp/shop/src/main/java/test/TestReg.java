package test;

import dao.DBcon;
import dao.MemberDao;
import dto.Member;

public class TestReg {
	public static void main(String[] args) {

		// Connection conn = DBcon.getConnection();
		
		MemberDao dao = new MemberDao();
		Member member = new Member("aaa", "1234", "james");
		
		int result = dao.registMember(member);
		
		if (result == 1) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
		
	}
}
