package com.ravina;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int value1=Integer.parseInt(req.getParameter("value1"));
		int value2=Integer.parseInt(req.getParameter("value2"));
		int add=value1+value2;
		HttpSession session=req.getSession();
		session.setAttribute("add", add);
//		RequestDispatcher rd=req.getRequestDispatcher("/add");
//		rd.forward(req, res);
		
		res.sendRedirect("add");
	}

}
