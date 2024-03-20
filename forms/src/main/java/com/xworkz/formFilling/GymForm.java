package com.xworkz.formFilling;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/gymOwner", loadOnStartup=1)
public class GymForm extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	

	public GymForm() {
		System.out.println("no args constructor");
	}
	
	@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running Gym form in service");
		String fullName=req.getParameter("name");
		String weight=req.getParameter("weight");
		String height=req.getParameter("height");
		String age=req.getParameter("age");
		String contactNumber=req.getParameter("no");
		String email=req.getParameter("email");
		System.out.println(fullName);
		System.out.println(weight);
		System.out.println(height);
		System.out.println(age);
		System.out.println(contactNumber);
		System.out.println(email);
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/plain");
		writer.write(" Service in line......Gym application form is processing");
		
		
	}

}




