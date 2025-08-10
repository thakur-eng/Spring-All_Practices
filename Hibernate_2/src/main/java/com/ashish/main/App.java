package com.ashish.main;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ashish.bean.User;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		User user = new User();
		user.setName("Ritesh Kumar");
		user.setEmail("kritesh7874@email.com");

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		session.save(user);
		txn.commit();
		session.close();
		factory.close();
		System.out.println("User saved successfully!");
	}
} 
