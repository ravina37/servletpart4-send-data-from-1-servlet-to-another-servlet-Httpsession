package com.ravina;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int value1=Integer.parseInt(req.getParameter("value1"));
		int value2=Integer.parseInt(req.getParameter("value2"));
		int add=value1+value2;
		PrintWriter out=res.getWriter();
		out.println("Add of above 2 values is:"+add);
	}

}
