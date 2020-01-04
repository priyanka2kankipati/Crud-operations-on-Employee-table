package com.deloitte.empl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;
import com.deloitte.empl.utils.ConvertDate;

public class AddEmp extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	
	int empnum=Integer.parseInt(request.getParameter("enum"));
	String ename=request.getParameter("ename");
	String ejob=request.getParameter("ejob");
	int managerId=Integer.parseInt(request.getParameter("managerid"));
	String hireDate=request.getParameter("hiredate"); 
	//Date d1=ConvertDate.parseDate(hireDate);
	int salary=Integer.parseInt(request.getParameter("salary"));
	int commino=Integer.parseInt(request.getParameter("commision"));
	int depno=Integer.parseInt(request.getParameter("depno"));
	
	
	
	Emp emp = new Emp(empnum,ename,ejob,managerId,hireDate, salary,commino, depno);
	EmpDao dao = new EmpDaoImpl();
	int rows = dao.addEmp(emp);
	if(rows>0)
		out.println("inserted");
	else
		out.println("not inserted");
	
	}

}
