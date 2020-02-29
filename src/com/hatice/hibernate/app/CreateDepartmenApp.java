package com.hatice.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hatice.hibernate.entity.Department;

public class CreateDepartmenApp {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Department.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		Department department=new Department("Shipping",100);
		department.setLocationId(1700);
		
		
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
		
		System.out.println("Id of inserted record: "+department.getDepartmentId()); 
		
	}
	
	
	

}
