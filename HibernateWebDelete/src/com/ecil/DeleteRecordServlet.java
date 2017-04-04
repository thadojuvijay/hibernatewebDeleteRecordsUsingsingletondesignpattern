package com.ecil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteRecordServlet
 */
@WebServlet("/DeleteRecordServlet")
public class DeleteRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	Integer eno = Integer.parseInt(	request.getParameter("eno"));
	
	Employee employee=new Employee();
	employee.setEno(eno);
	EmployeeDao dao=new EmployeeDao();
	dao.deleteEmployeeRecords(employee);
	
	PrintWriter out = response.getWriter();
	out.println("record deleted");
	}

}
