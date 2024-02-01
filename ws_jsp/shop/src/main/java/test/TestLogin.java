package test;

import dao.MemberDao;

public class TestLogin {

	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		
		int result = dao.loginCheck("aaa", "4444");
		
		if (result == 1) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}


	}

}
