package com.ashish.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ashish.bean.Collage;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate program hellow world");

		Collage collage = new Collage();
		collage.setName("Ashish");
		collage.setAge("25");
		collage.setEmail("ashish@gmail.com");

		org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
		config.configure("com/ashish/main/config/hibernate.cfg.xml");

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		session.save(collage);
		txn.commit();
		session.close();
		factory.close();
		System.out.println("User saved successfully!");

	}
}
