package com.rau.lara.hibernate.manager;

import java.util.Scanner;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.rau.lara.hibernate.pojo.Person;

public class FirstManager {

	public static void main(String[] args) {
		
		System.out.println("Manager Begin");
		        
		//DB connection         
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
        SessionFactory sf= metadata.getSessionFactoryBuilder().build();
        
        Session s1= sf.openSession();
        
        Person p1 = new Person();
        p1.setFirstName("lara");
        p1.setLastName("rst");
        p1.setAge(22);
        Person p2 = new Person();
        p2.setFirstName("raushan");
        p2.setLastName("kumar");
        p2.setAge(28);
        
        s1.beginTransaction();// only required for insert,update and delete
        s1.save(p1);
        s1.save(p2);
        //s1.persist(p1);//persist method return void 
        s1.getTransaction().commit();
        s1.close();
        
        
        Scanner sc = new Scanner(System.in);
        String firstName,lastName,decider;
        int age;
        Person p0=null;
        s1.beginTransaction();
        do {
        	p0= new Person();
        	System.out.println("Enter first Name:");
        	p0.setFirstName(sc.next());
        	System.out.println("Enter last Name:");
        	p0.setLastName(sc.next());
        	System.out.println("Enter last age:");
        	p0.setAge(sc.nextInt());
        	s1.save(p0);
        	System.out.println("Do you want to save one more y/n : ");
        	decider = sc.next();
        }while(decider.equalsIgnoreCase("y"));
        s1.getTransaction().commit();
        s1.close();
        
        Person p00 = s1.get(Person.class, 1);
        Person p02 = s1.load(Person.class, 2);
        System.out.println(p00.getId()+" - "+p00.getFirstName()+" - "+p00.getLastName()+" - "+p00.getAge());
        System.out.println(p02.getId()+" - "+p02.getFirstName()+" - "+p02.getLastName()+" - "+p02.getAge());
        
        
        s1.beginTransaction();
        Person p002 = s1.load(Person.class, 2);
        p002.setFirstName("RAUSHAN");
        p002.setLastName("Singh");
        p002.setAge(27);
        s1.update(p002);
        s1.getTransaction().commit();
        
        
        s1.beginTransaction();
        Person p3 = s1.load(Person.class, 1);
        s1.delete(p3);
        s1.getTransaction().commit();
        
        
        
        System.out.println("Manager end!");
	}

}
