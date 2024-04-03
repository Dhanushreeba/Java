package com.xworkz.iplServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/ipl", loadOnStartup=1)
public class IPLMatchForm extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public IPLMatchForm() {
		System.out.println("no argu Constructor");
	
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service running in IPL  Details form");
		
		String name=req.getParameter("name1");
		String stats=req.getParameter("stats1");
		String city=req.getParameter("city1");
		String teams=req.getParameter("teams1");
		String match=req.getParameter("match1");
		String wins=req.getParameter("wins1");
		String loss=req.getParameter("loss1");
		String players=req.getParameter("players1");
		String captains=req.getParameter("captains1");
		String pts=req.getParameter("pts1");
		String overs=req.getParameter("overs1");
		String playersInTeam=req.getParameter("playersInTeam1");
		String bowlers=req.getParameter("bowlers1");
		String batsman=req.getParameter("batsman1");
		String owner=req.getParameter("owner1");
		System.out.println(name);
		System.out.println(stats);
		System.out.println(city);
		System.out.println(teams);
		System.out.println(match);
		System.out.println(wins);
		System.out.println(loss);
		System.out.println(players);
		System.out.println(captains);
		System.out.println(pts);
		System.out.println(overs);
		System.out.println(playersInTeam);
		System.out.println(bowlers);
		System.out.println(batsman);
		System.out.println(owner);

				
		RequestDispatcher dispatcher=req.getRequestDispatcher("Match.jsp");
		req.setAttribute("aj", name);
		req.setAttribute("ba", stats);
		req.setAttribute("sk", city);
		req.setAttribute("vg", teams);
		req.setAttribute("bp", match);
		req.setAttribute("vm", wins);
		req.setAttribute("mj", loss);
		req.setAttribute("fg", players);
		req.setAttribute("pr", captains);
		req.setAttribute("ko", pts);
		req.setAttribute("vm", overs);
		req.setAttribute("qw", playersInTeam);
		req.setAttribute("sl", bowlers);
		req.setAttribute("vc", batsman);
		req.setAttribute("xz", owner);
		dispatcher.forward(req,resp);
	}

}
