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
		
		out.println("���̵�: " + userId + "<br>");
		out.println("��й�ȣ: " + userPwd + "<br>");
		out.println("�̸���: " + email + "<br>");
		out.println("�̸��� ���ſ���: " + emailAgree + "<br>");
		out.println("���ɻ���: ");
		for(int i=0; i< interest.length; i++) {			
            if(i+1 == interest.length) {
                out.println(interest[i]);
            }else {
            	
                out.println(interest[i] + ",");
            }            
        }
		out.println("<br>");
		out.println("��ȭ��ȣ: " + phone_1 + phone_2 + "<br>");
		out.println("�ڱ�Ұ�: " + introduce + "<br>");
		
		out.close();
	}

}
