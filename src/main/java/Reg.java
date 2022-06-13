import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Reg extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		String email = req.getParameter("email");
		String emailAgree = req.getParameter("emailAgree");
		String[] interest = req.getParameterValues("interest");
		String phone_1 = req.getParameter("phone_1");
		String phone_2 = req.getParameter("phone_2");
		String introduce = req.getParameter("introduce");		
		
		out.println("아이디: " + userId + "<br>");
		out.println("비밀번호: " + userPwd + "<br>");
		out.println("이메일: " + email + "<br>");
		out.println("이메일 수신여부: " + emailAgree + "<br>");
		out.println("관심사항: ");
		for(int i=0; i< interest.length; i++) {			
            if(i+1 == interest.length) {
                out.println(interest[i]);
            }else {
            	
                out.println(interest[i] + ",");
            }            
        }
		out.println("<br>");
		out.println("전화번호: " + phone_1 + phone_2 + "<br>");
		out.println("자기소개: " + introduce + "<br>");
		
		out.close();
	}

}
