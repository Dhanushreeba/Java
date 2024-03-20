package com.xworkz.formFilling;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/vehicalOwner", loadOnStartup=1)
public class VehicleService  extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	

	public VehicleService() {
		System.out.println("no args constructor");
	}
	
	@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running death form in service");
		String firstName=req.getParameter("first");
		String lastName=req.getParameter("last");
		String phoneNumber=req.getParameter("no");
		String vehicalMake=req.getParameter("make");
		String vehicalModel=req.getParameter("model");
		String dateOfPickup=req.getParameter("date");
		String dateOfSrvice=req.getParameter("date");
		String email=req.getParameter("email");
		String vehicalNumber=req.getParameter("number");
		String address=req.getParameter("address");
		String areaPincode=req.getParameter("pin");
		String insurance=req.getParameter("insurance");
		String oilChange=req.getParameter("oilchange");
		String tireRotation=req.getParameter("tirerotation");
		String cityName=req.getParameter("city");
		String costOfService=req.getParameter("cost");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(phoneNumber);
		System.out.println(vehicalMake);
		System.out.println(vehicalModel);
		System.out.println(dateOfPickup);
		System.out.println(dateOfSrvice);
		System.out.println(email);
		System.out.println(vehicalNumber);
		System.out.println(address);
		System.out.println(areaPincode);
		System.out.println(insurance);
		System.out.println(oilChange);
		System.out.println(tireRotation);
		System.out.println(cityName);
		System.out.println(costOfService);
		
		resp.setContentType("text/plain");
		PrintWriter write = resp.getWriter();
		write.write("Service in line......");
		
	}

}





