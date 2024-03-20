package com.xworkz.part;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/parts", loadOnStartup = 1)
public class TvReacharge extends HttpServlet{

		
			private static final long serialVersionUID = 1L;

			public TvReacharge() {
				System.out.println("no args constructor");
			}
			
			@Override
			protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				System.out.println("service running in Computer part Servlet");
				String customerId=req.getParameter("customerId");
				String vendor=req.getParameter("vendor");
				String amount=req.getParameter("amount");
				String type=req.getParameter("type");
		
				
				resp.setContentType("text/plain");
				System.out.println(customerId);
				System.out.println(vendor);
				System.out.println(amount);
				System.out.println(type);
				
				PrintWriter writer = resp.getWriter();
				writer.write("<html>");
				writer.write("<head>");
				writer.write("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC' crossorigin='anonymous'>");
				writer.write("<nav class=\"navbar navbar-expand-lg navbar navbar-dark bg-dark\">"
						+ "<div class=\"container-fluid\">"
						+ "<div class=\"container\">"
						+ "<a class=\"navbar-brand\" href=\"index.html\"><button type=\"button\" class=\"btn btn-light\">Home</button></a>"
						+ "<a class=\"navbar-brand\" href=\"index.html\"><button type=\"button\" class=\"btn btn-light\">Computer</button></a>\r\n"
						+ "<a class=\"navbar-brand\" href=\"TvReacharge.html\"><button type=\"button\" class=\"btn btn-light\">TvReacharge</button></a>"
						+ "<a class=\"navbar-brand\" href=\"ComputerPart.html\"><button type=\"button\" class=\"btn btn-light\">Back</button></a>\r\n"
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
				
				writer.write("Tv Reacharge Service in line......");


			}

}
