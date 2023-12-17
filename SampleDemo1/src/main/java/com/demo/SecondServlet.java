package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		String name = "";
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies == null) {
			pw.println("<h1> You are new User plese go to the index page</h1>");
			request.getRequestDispatcher("index.html").include(request, response);
			return;
		}
		else {
			
			for(Cookie c : cookies) {
				if(c.getName().equals("name"))
				name = c.getValue();
			}
			
		}
		
		
		pw.println("<h1> Hello "+ name);
		
	}

	
	
}
