package com.ashish.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ashish.main.bean.Employee;

 
public class App {
    public static void main(String[] args) {

        Employee emp = new Employee();   
        emp.setName("PRASHANT");
        emp.setEmail("KRPASHANTKUMAR123@gmail.com");
        emp.setPassword("@#$@#$");

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();

        session.save(emp); // saving this object to the table
        txn.commit();

        session.close();
        sessionFactory.close();

        System.out.println("Employee saved successfully!");
    }
}