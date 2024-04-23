package reciptFormSrervlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/check", loadOnStartup=1)

public class Amazon extends HttpServlet{
	

	private static final long serialVersionUID = 1L;

	public Amazon() {
		
		System.out.println("no agr Constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service running in Recipt form");
		
		String name=req.getParameter("name1");
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Recipt.jsp");
		req.setAttribute("aj", name);
		dispatcher.forward(req,resp);

	}
}