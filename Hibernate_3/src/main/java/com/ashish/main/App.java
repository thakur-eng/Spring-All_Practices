package com.ashish.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.ashish.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hibernate program hellow world"); 
    	Student student = new Student();
    	 
    	student.setName("Pooja");
    	student.setEmail("pooja@gmail.com");
    	student.setStatus("Present");
    	student.setName("Monika");
    	student.setEmail("monika@gmail.com");
    	student.setStatus("Absent");
    	student.setName("UrfiJaved");
    	student.setEmail("urfijaved@gmail.com");
    	student.setStatus("Present");
    	 
    	
    	Configuration cfg = new Configuration().configure(); 
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	Transaction txn = session.beginTransaction();
    	
    	session.save(student);
    	txn.commit();
    	session.close();
    	factory.close();
    	System.out.println("User saved successfully!");
    	
    }
}

