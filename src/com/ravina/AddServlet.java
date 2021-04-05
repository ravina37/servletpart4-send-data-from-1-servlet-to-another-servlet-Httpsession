package com.ravina;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession session=req.getSession();
		int add=(int) session.getAttribute("add");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<h1>Result:</h1>");
		out.println("<h1>Add of above 2 values is:</h1>"+add);
		System.out.println("worked!!!!!!");
	}

}
