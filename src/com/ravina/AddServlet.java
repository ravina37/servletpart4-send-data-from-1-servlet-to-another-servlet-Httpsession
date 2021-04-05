package com.ravina;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		int add=(int) req.getAttribute("add");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<h1>Result:</h1>");
		out.println("Add of above 2 values is:"+add);
		System.out.println("worked");
	}

}
