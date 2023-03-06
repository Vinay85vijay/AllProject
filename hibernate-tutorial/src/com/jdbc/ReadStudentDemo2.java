package com.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo2 {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new  Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		//session
		Session session = factory.getCurrentSession();
	try {
		//create a student object
		
		
		System.out.println("creating a new student obj");
		Student tempStudent1 = new Student("pppl", "wall","pppl@gmail.com");
	
		
		//get a new session n start a transaction
		session=factory.getCurrentSession();
		session.beginTransaction();
		
		//retrive student based on id: pk
		
		System.out.println("/nGETTING student with id: " +tempStudent1.getId());
		Student myStudent = session.get(Student.class, tempStudent1.getId());
		System.out.println("Get complete: "+myStudent);
		
		
		
	
		
		//commit transaction
		session.getTransaction().commit();
	//	System.out.println("save student . Generated id: " +tempStudent1.getId());
		System.out.println("done");
		
		
	} finally {
      factory.close();
	}

	}

}
