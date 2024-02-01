package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.MemberDao;

class TestLoginCheck {

	MemberDao dao = new MemberDao();
	

	@Test
	void test() {
		int result = dao.loginCheck("aaa", "4444");
		
		assertEquals(1, result);
	}

}
