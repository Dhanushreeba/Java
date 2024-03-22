package com.xworkz.part;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/metro", loadOnStartup=1)
public class MetroDetails extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;

	public MetroDetails() {
		
		System.out.println("no-arg constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("service running in Metro Details........");
		String employeeId =req.getParameter("employeeId1");
		String metroLines=req.getParameter("metroLines1");
		String platformNumber=req.getParameter("platformNumber1");
		String metroVoltage=req.getParameter("metroVoltage1");
		String station=req.getParameter("station1");
		
		
		
		resp.setContentType("text/html");
		System.out.println("employeeId :"+employeeId);
		System.out.println("MetroLines :"+metroLines);
		System.out.println("PlatformNumber :"+platformNumber);
		System.out.println("MetroVoltage :"+metroVoltage);
		System.out.println("Station :"+station);

		
		PrintWriter writer=resp.getWriter();
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		writer.write("<nav class=\"navbar navbar-expand-lg navbar navbar-dark bg-dark\">"
				+ "<div class=\"container-fluid\">"
				+ "<div class=\"container\">"
				+ "<a class=\"navbar-brand\" href=\"index.html\"><button type=\"button\" class=\"btn btn-light\">Home</button></a>"
				+ "<a class=\"navbar-brand\" href=\"MetroDetails.html\"><button type=\"button\" class=\"btn btn-light\">Back</button></a>\r\n"
				+ "</div>\r\n"
				+ "<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "<span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "</button>"
				+ "<div class=\"collapse navbar-collapse\" id=\"navbarNav\">"
				+ "</div>"
				+ "</div>"
				+ "</nav>");
		writer.write("</head>");
		writer.write("</html>");
		writer.write("<b>Metro Details Service in line......<b><br>");
		writer.print("<b>EmployeeId :</b>"+employeeId+"<br>");
		writer.print("<b>MetroLines :</b>"+metroLines+"<br>");
		writer.print("<b>PlatformNumber :</b>"+platformNumber+"<br>");
		writer.print("<b>MetroVoltage :</b>"+metroVoltage+"<br>");
		writer.print("<b>Station :</b>"+station+"<br>");
		
		
	}
}
