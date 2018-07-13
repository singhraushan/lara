Technology used: Hibernate,Maven,mysql,xml,java
Steps:
1.cfg.xml file: database configuration
2.hbn.xml file: Entity configuration
3.Pojo class
4. Manager class : here creating session factory,session,& all action

Configuration class’ buildSessionFactory() method is deprecated in hibernate4.0 onward, so recomended to use buildSessionFactory(ServiceRegistry)
 
 using dialect org.hibernate.dialect.MySQL5Dialect instead of org.hibernate.dialect.MySQLDialect, because org.hibernate.dialect.MySQLDialect not creating table by hibernate 
