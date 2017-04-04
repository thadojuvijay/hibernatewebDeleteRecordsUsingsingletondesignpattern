package com.ecil;

import org.hibernate.Session;


public class EmployeeDao

{
public void deleteEmployeeRecords(Employee employee)
{
	
	Session session = HibernateUtility.getSession();
	session.beginTransaction();

   session.load(Employee.class,employee.getEno());
	session.delete(employee);
	
	session.getTransaction().commit();
	session.close();
	
}
}
