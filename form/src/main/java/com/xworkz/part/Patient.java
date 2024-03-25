package com.xworkz.part;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet (urlPatterns="/patient", loadOnStartup= 1)
public class Patient extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public Patient() {
		
		System.out.println("no-arg constructors");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service running in Patient form");
		String name=req.getParameter("name1");
		String dateOfBirth=req.getParameter("dateOfBirth1");
		String email=req.getParameter("email1");
		String diseases=req.getParameter("diseases1");
		String hospitalNames=req.getParameter("hospitalNames1");
		
		resp.setContentType("text/html");
		System.out.println("Name :" +name);
		System.out.println("DateOfBirth :" +dateOfBirth);
		System.out.println("Email :" +email);
		System.out.println("Diseases :" +diseases);
		System.out.println("HospitalNames :" +hospitalNames);
		
		PrintWriter writer=resp.getWriter();
		writer.write("<html>");	
		writer.write("<head>");
		writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		writer.write("<nav class=\"navbar navbar-expand-lg navbar navbar-dark bg-dark\">"
				+ "<div class=\"container-fluid\">"
				+ "<a class=\"navbar-brand\" href=\"index.html\"><button type=\"button\" class=\"btn btn-light\">Home</button></a>"
				+ "<a class=\"navbar-brand\" href=\"index.html\"><button type=\"button\" class=\"btn btn-light\">Back</button></a>"
				+ "</div>"
				+ "<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">"
				+ "<span class=\"navbar-toggler-icon\"></span>"
				+ "</button>"
				+ "<div class=\"collapse navbar-collapse\" id=\"navbarNav\">"
				+ "</div>"
				+ "</nav>");
		writer.write("<head>");
		writer.write("<html>");
		writer.write("<b>Patient form running in Servlet.......</b><br>");
		writer.write("<b>Name :</b>" +name+ "<br>");
		writer.write("<b>DateOfBirth :</b>" +dateOfBirth+ "<br>");
		writer.write("<b>Email :</b>" +email+ "<br>");
		writer.write("<b>Diseases :</b>" +diseases+ "<br>");
		writer.write("<b>HospitalNames :</b>" +hospitalNames);
		
	}
}
