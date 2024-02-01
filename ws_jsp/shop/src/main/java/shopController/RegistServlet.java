package shopController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import dto.Member;

@WebServlet("/registProc")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		Member member = new Member(id, pw, name);
		
		MemberDao dao = new MemberDao();
		
		int result = dao.registMember(member);
		
		if (result == 1) {
			response.sendRedirect("success.jsp");
		} else {
			response.sendRedirect("success.jsp");
		}
	}

}
