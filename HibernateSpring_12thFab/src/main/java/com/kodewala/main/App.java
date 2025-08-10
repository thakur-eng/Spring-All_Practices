package com.kodewala.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kodewala.main.bean.Student.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student student = new Student();
        student.setName("Ashish");
        student.setEmail("ashish@gmail.com");
        
        org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
        config.configure("/com/kodewala/main/config/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		org.hibernate.Transaction txn = session.beginTransaction();

		session.save(student);// saving this object to the table.

		txn.commit();
    }
}
