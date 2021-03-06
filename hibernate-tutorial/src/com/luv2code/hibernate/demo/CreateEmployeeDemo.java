package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class CreateEmployeeDemo {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg2.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			Employee employee = new Employee("A", "AA", "AAA");
			
			session.beginTransaction();
			
			session.save(employee);
			
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
		
	}
	
}