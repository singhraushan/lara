package com.rau.lara.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Util {
	static  SessionFactory sf = null;
  static {
	  StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
              .configure("hibernate.cfg.xml").build();
      Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
      sf = metadata.getSessionFactoryBuilder().build();
  }
  
  public static Session openSession() {
	return sf.openSession();
  }
}
