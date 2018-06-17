package com.rau.lara.hibernate.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rau.lara.hibernate.pojo.Employee;

public class FirstManager {

	public static void main(String[] args) {
		System.out.println("Begin");
		// TODO Auto-generated method stub
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Raushan kumar");
        emp.setAddress("Bihar");
        emp.setPin_code("848204");
        
        //DB connection 
        Configuration conf = new Configuration();//by default look for hibernate.cfg.xml
        conf.configure();
        SessionFactory sf= conf.buildSessionFactory();
        
        Session s1= sf.openSession();
        s1.beginTransaction();
        
        s1.save(emp);
        
        s1.getTransaction().commit();
        s1.close();
        System.out.println("Done!");
	}

}
