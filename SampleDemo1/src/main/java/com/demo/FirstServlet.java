package com.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String name = request.getParameter("name");
		
		PrintWriter pw = response.getWriter();
	
		pw.println("<h1> welcome "+name+"</h1");
		
		pw.println("<h4> <a href='SecondServlet'> Go to second servlet </a>");
		
		
		Cookie cookie = new Cookie("name", name);
		
		response.addCookie(cookie);
				
		//RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
		
		
		
		
		//rd.include(request, response);
		
	
		
	}

}
