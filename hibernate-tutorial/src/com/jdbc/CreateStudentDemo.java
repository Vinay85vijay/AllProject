package com.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

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
		Student tempStudent1 = new Student("paul", "wall","paul@gmail.com");
		Student tempStudent2 = new Student("pau", "wall","pau@gmail.com");
		Student tempStudent3 = new Student("pa", "wall","pa@gmail.com");
		
		//start a transaction
		session.beginTransaction();
		//save the object
		System.out.println("saving the student");
		session.save(tempStudent1);
		session.save(tempStudent2);
		session.save(tempStudent3);
		
	
		
		//commit transaction
		session.getTransaction().commit();
		System.out.println("done");
		
		
	} finally {
      factory.close();
	}

	}

}
