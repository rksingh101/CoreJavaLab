package com.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ThirdServlet extends HttpServlet{
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
		{
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<body>");
			
			ServletContext context = getServletContext();
			String fname = (String) context.getAttribute("fname");
			String lname = (String) context.getAttribute("lname");
			
			
			String state =null;
			String city =null;
			
			state = request.getParameter("state");
			city = request.getParameter("city");
			
			context.setAttribute("state", state);
			context.setAttribute("city", city);
			
			
			out.println("<form action='display3' method='get'>");
			
			
			out.println("First Name:<input type='text' readonly value="+fname+" />");
			out.println("<br>");
			out.println("<br>");
			out.println("Last Name: <input type='text' readonly value="+lname+" />");
			out.println("<br>");
			out.println("<br>");
			out.println("City:<input type='text' readonly value="+state+" />");
			out.println("<br>");
			out.println("<br>");
			out.println("State:<input type='text' readonly value="+city+" />");
			out.println("<br>");
			out.println("<br>");
			out.println("Phone:<input type='text' name='phone'/>");
			out.println("<br>");
			out.println("<br>");
			out.println("Email:<input type='text' name='email'/>");
			out.println("<br>");
			out.println("<br>");
			out.println("<input type='submit' value='Submit' name='continue'/>");
			
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		}
}
