package com.xworkz.formFilling;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/deathPerson", loadOnStartup = 1)
public class DeathForm extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DeathForm() {
		System.out.println("no args constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running service in death form in Servlet");

		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String placeOfDeath = req.getParameter("place");
		String dateOfDeath = req.getParameter("date");
		String causeOfDeath = req.getParameter("cause");
		String gender = req.getParameter("gender");
		String motherName = req.getParameter("mother");
		String fatherName = req.getParameter("father");
		String addressOfTheDeceased = req.getParameter("address");
		String remarks = req.getParameter("remarks");

		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/plain");
		System.out.println(name);
		System.out.println(age);
		System.out.println(placeOfDeath);
		System.out.println(dateOfDeath);
		System.out.println(causeOfDeath);
		System.out.println(gender);
		System.out.println(motherName);
		System.out.println(fatherName);
		System.out.println(addressOfTheDeceased);
		System.out.println(remarks);
		writer.write("The Death certificate is currently being processed....");

	}

}
