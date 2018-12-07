package com.arenggworks;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class adddetail extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String Name=req.getParameter("username");
		String roll=req.getParameter("rollno");
		String email=req.getParameter("email");
		String phn=req.getParameter("phn");
		
		PrintWriter out=res.getWriter();
		out.print("Name of the user is:"+Name+"\n"
				+"Rollno:"+roll+"\nemail:"+email+"\nphn:"+phn);
		
	}
}
