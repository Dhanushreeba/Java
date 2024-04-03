package com.xworkz.percentage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/market", loadOnStartup=1)
public class MarketDetails extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
	public MarketDetails() {
		System.out.println("no argu Constructor running in MarketServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
System.out.println("service running in Market Details form");
		
		String name=req.getParameter("name1");
		String location=req.getParameter("location1");
		String city=req.getParameter("city1");
		String pincode=req.getParameter("pincode1");
		String area=req.getParameter("area1");
		String type=req.getParameter("type1");
		String stallNo=req.getParameter("stallNo1");
		String itemName=req.getParameter("itemName1");
		String itemQuality=req.getParameter("itemQuality1");
		String itemQuantity=req.getParameter("itemQuantity1");
		String itemCost=req.getParameter("itemCost1");
		String stallOwner=req.getParameter("stallOwner1");
		String stallKebNo=req.getParameter("stallKebNo1");
		String gstNo=req.getParameter("gstNo1");
		String transaction=req.getParameter("transaction1");
		System.out.println(name);
		System.out.println(location);
		System.out.println(city);
		System.out.println(pincode);
		System.out.println(area);
		System.out.println(type);
		System.out.println(stallNo);
		System.out.println(itemName);
		System.out.println(itemQuality);
		System.out.println(itemQuantity);
		System.out.println(itemCost);
		System.out.println(stallOwner);
		System.out.println(stallKebNo);
		System.out.println(gstNo);
		System.out.println(transaction);

				
		RequestDispatcher dispatcher=req.getRequestDispatcher("MarketResult.jsp");
		req.setAttribute("aj", name);
		req.setAttribute("ba", location);
		req.setAttribute("sk", city);
		req.setAttribute("vg", pincode);
		req.setAttribute("bp", area);
		req.setAttribute("vm", type);
		req.setAttribute("mj", stallNo);
		req.setAttribute("fg", itemName);
		req.setAttribute("ui", itemQuality);
		req.setAttribute("pr", itemQuantity);
		req.setAttribute("ko", itemCost);
		req.setAttribute("qw", stallOwner);
		req.setAttribute("sl", stallKebNo);
		req.setAttribute("vc", gstNo);
		req.setAttribute("xz", transaction);
		dispatcher.forward(req,resp);
	}

}
