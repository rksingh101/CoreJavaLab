package com.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		/*HttpSession session = request.getSession(true);
		if(session ==  null)
		{
			System.out.println("No session available for client");
		}
        */
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<form action='display2' method='get'>");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
	
		out.println("First Name:<input type='text' readonly value="+fname+" name='fname'/>");
		out.println("<br>");
		out.println("<br>");
		out.println("Last Name: <input type='text' readonly value="+lname+" name='lname'/>");
		out.println("<br>");
		out.println("<br>");
		out.println("State: <input type='text' value='' name='state'/>");
		out.println("<br>");
		out.println("<br>");
		out.println("City: <input type='text'  value='' name='city'/>");
		out.println("<br>");
		out.println("<br>");
		out.println("<input type='submit' value='Submit' name='continue'/>");
		
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		}
	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		HttpSession session = request.getSession(true);
		if(session ==  null)
		{
			System.out.println("No session available for client");
		}
		
		
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		
		if(session ==  null)
		{
			System.out.println("No session available for client");
		}
		if(request.getParameterValues("continue")!= null)
	  	{
	  		response.sendRedirect("startPage");  	
	  	}
  	
	}*/

}
