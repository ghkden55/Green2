package test;

import dao.MemberDao;
import dto.Member;

public class TestModify {
	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		
		Member member = new Member("aaa", "4444", "Anne");
		
		int result = dao.modifyMember(member);
		
		if (result == 1) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
		
	}
}
