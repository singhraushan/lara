package com.rau.lara.hibernate.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rau.lara.hibernate.pojo.Employee;

public class FirstManager {

	public static void main(String[] args) {
		
		System.out.println("Begin");
		
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Raushan kumar");
        emp.setAddress("Bihar");
        emp.setContact_Number("8056059100");
        
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
