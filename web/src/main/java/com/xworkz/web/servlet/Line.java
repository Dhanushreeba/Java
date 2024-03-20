package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/click")
public class Line extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Line() {
		System.out.println("no args constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service running in frame servlet");
		System.out.println("server request:" + req.getRemoteAddr());

		resp.setContentType("text/plain");
		PrintWriter write = resp.getWriter();
		write.write("Service in line......");
	}

}
