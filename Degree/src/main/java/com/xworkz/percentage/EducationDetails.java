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
		
		String name=req.getParameter("name1");
		String email=req.getParameter("email1");
		String college=req.getParameter("college1");
		String degree=req.getParameter("degree1");
		String branch=req.getParameter("branch1");
		String percentage=req.getParameter("percentage1");
		System.out.println(name);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Result.jsp");
		req.setAttribute("aj", name);
		req.setAttribute("ba", email);
		req.setAttribute("sk", college);
		req.setAttribute("vg", degree);
		req.setAttribute("bp", branch);
		req.setAttribute("vm", percentage);
		dispatcher.forward(req,resp);
	}
	
}
