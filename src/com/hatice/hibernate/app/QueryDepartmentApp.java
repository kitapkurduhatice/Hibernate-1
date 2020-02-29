package com.hatice.hibernate.app;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hatice.hibernate.entity.Department;



public class QueryDepartmentApp {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Department.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		List<Department> department=session.createQuery("from Department where locationId='1700'").getResultList();
		for (Department department2 : department) {
			System.out.println(department2);
			
		}
		/*
		Query query=session.createQuery("from Department where locationId='1700'");
		List list=query.getResultList();
		System.out.println(list);*/
		session.getTransaction().commit();
	}
	


}
