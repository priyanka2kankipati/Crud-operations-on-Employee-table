package com.deloitte.empl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

@WebServlet("/GetEmpls")
public class GetEmpls extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	
	/*ServletContext ctx=getServletContext();
	out.println("City="+ctx.getInitParameter("city")+"<br>");
	
	ServletConfig config=getServletConfig();
	out.println("mobile:"+config.getInitParameter("mobile")+"<br>");
	*/
	EmpDao doa =new EmpDaoImpl();
	List<Emp> emplist=doa.getEmpls();
	out.println("<table border=2");
	out.println("<tr><th>EMPNO<TH>EMPNAME<TH>JOB</tr>");
	for(Emp e:emplist)
	{
		out.println("<tr>");
		out.println("<td>"+e.getEmpno()+"</td>");
		out.println("<td>"+e.getEname()+"</td>");
		out.println("<td>"+e.getJob()+"</td>");
	}
	out.println("</table>");
	
	
	}

}
