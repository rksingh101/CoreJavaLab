package com.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ThirdServlet extends HttpServlet{
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
		{
			/*HttpSession session = request.getSession(true);
			if(session ==  null)
			{
				System.out.println("No session available for client");
			}*/
	        
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<body>");
			
			String fname =null;
			String lname =null;
			String state =null;
			String city =null;
			
			fname = request.getParameter("fname");
			lname = request.getParameter("lname");
			state = request.getParameter("state");
			city = request.getParameter("city");
			
			out.println("<form action='display3' method='get'>");
			
			
			out.println("First Name:<input type='text' readonly value="+fname+" name='fname'/>");
			out.println("<br>");
			out.println("<br>");
			out.println("Last Name: <input type='text' readonly value="+lname+" name='lname'/>");
			out.println("<br>");
			out.println("<br>");
			out.println("City:<input type='text' readonly value="+state+" name='state'/>");
			out.println("<br>");
			out.println("<br>");
			out.println("State:<input type='text' readonly value="+city+" name='city'/>");
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
