package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;


public class AutoInit1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String adminEmail;
	
	public void init(ServletConfig config) throws ServletException {
		
		String email = config.getInitParameter("adminEmail");
		this.adminEmail = email;
		
		System.out.println("Servlet carregado! adminEmail = " + this.adminEmail);
		
		
	}
	
}
