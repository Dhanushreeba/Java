package com.xworkz.project;

import java.io.IOException;
import java.util.UUID;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/click" ,loadOnStartup = 1)
public class DetailsServlet extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
	public DetailsServlet() {

		System.out.println("no argu constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service running in  Details form");
		
		String fName=req.getParameter("fName1");
		String lName=req.getParameter("lName1");
		System.out.println(fName);
		System.out.println(lName);
		

		String randomValue = getCookieValue(req, "Xworkz");

		if (randomValue == null) {

		randomValue = generateRandomValue();

		Cookie cookie = new Cookie("Xworkz", randomValue);

		cookie.setMaxAge(60 * 60);

		resp.addCookie(cookie);

		}

		req.setAttribute("randomValue", randomValue);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("ContactDetails.jsp");
		req.setAttribute("aj", fName);
		req.setAttribute("ba", lName);
		dispatcher.forward(req,resp);

	
		}

		private String generateRandomValue() {

		String uuid = UUID.randomUUID().toString();

		return uuid.substring(0, 20);

		}

		private String getCookieValue(HttpServletRequest request, String cookieName) {
		Cookie[] cookies = request.getCookies();

		if (cookies != null) {

		for (Cookie cookie : cookies) {
		if (cookie.getName().equals(cookieName)) {

		return cookie.getValue();

		}

		}

		}

		return null;

		}
	

}
