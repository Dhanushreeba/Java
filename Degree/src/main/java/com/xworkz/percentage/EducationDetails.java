package com.xworkz.percentage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/result", loadOnStartup=1)
public class EducationDetails extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
	
	public EducationDetails() {
		System.out.println("no-argu constructors running in educationDetails Servelt");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service running in Education Details form");
		
		String name=req.getParameter("name");
		System.out.println(name);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Message.jsp");
		req.setAttribute("name1", name);
		dispatcher.forward(req,resp);
	}
	
}
