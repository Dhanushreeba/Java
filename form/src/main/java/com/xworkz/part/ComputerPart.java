package com.xworkz.part;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/parts", loadOnStartup = 1)
public class ComputerPart extends HttpServlet{
	
		private static final long serialVersionUID = 1L;

		public ComputerPart() {
			System.out.println("no args constructor");
		}
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("service running in Computer part Servlet");
			String brand=req.getParameter("brand");
			String model=req.getParameter("model");
			String color=req.getParameter("color");
			String type=req.getParameter("type");
			String ram=req.getParameter("ram");
			String hardDisk=req.getParameter("hardDisk");
			String processor=req.getParameter("processor");
			String generation=req.getParameter("generation");
			String motherBoard=req.getParameter("motherBoard");
			String cacheSize=req.getParameter("cacheSize");
			String cost=req.getParameter("cost");
			String quantity=req.getParameter("quantity");
			double price=Double.valueOf(cost);
			int quantity1=Integer.parseInt(quantity);
			Double total=price*quantity1;
			
			resp.setContentType("text/html");
			System.out.println(brand);
			System.out.println(model);
			System.out.println(color);
			System.out.println(type);
			System.out.println(ram);
			System.out.println(hardDisk);
			System.out.println(processor);
			System.out.println(generation);
			System.out.println(motherBoard);
			System.out.println(cacheSize);
			System.out.println(cost);
			System.out.println(quantity);
			System.out.println("total cost:" +total);
			
			
			PrintWriter writer = resp.getWriter();
			System.out.println("total cost:"+total);
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC' crossorigin='anonymous'>");
			writer.write("<nav class=\"navbar navbar-expand-lg navbar navbar-dark bg-dark\">"
					+ "<div class=\"container-fluid\">"
					+ "<div class=\"container\">"
					+ "<a class=\"navbar-brand\" href=\"index.html\"><button type=\"button\" class=\"btn btn-light\">Home</button></a>"
					+ "<a class=\"navbar-brand\" href=\"ComputerPart.html\"><button type=\"button\" class=\"btn btn-light\">Back</button></a>\r\n"
					+ "</div>\r\n"
					+ "<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
					+ "<span class=\"navbar-toggler-icon\"></span>\r\n"
					+ "</button>"
					+ "<div class=\"collapse navbar-collapse\" id=\"navbarNav\">"
					+ "</div>"
					+ "</div>"
					+ "</nav>");
			writer.write("<body>");
			writer.write("<div>");
			writer.write("Computer Parts Service in line......");
			writer.write("<b>"+"Total Cost :"+total+"</b>");
			writer.write("</div>");
			writer.write("</body>");
			writer.write("</html>");

			}
		

	

}
