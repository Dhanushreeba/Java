package com.xworkz.percentage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/read",loadOnStartup = 1)
public class PercentageServlet extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;
	
	public PercentageServlet()
	{
		System.out.println("Running no param const of PercentageServlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("service running in PercentageServlet Details form");
		
		String msg=req.getParameter("message");
		System.out.println(msg);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Message.jsp");
		req.setAttribute("name1", msg);
		dispatcher.forward(req,resp);
	}

}
