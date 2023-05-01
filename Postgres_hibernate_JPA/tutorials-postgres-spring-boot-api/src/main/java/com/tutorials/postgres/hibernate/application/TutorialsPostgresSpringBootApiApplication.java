package com.tutorials.postgres.hibernate.application;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorials.postgres.hibernate.application.model.UserModel;

@SpringBootApplication
public class TutorialsPostgresSpringBootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialsPostgresSpringBootApiApplication.class, args);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
			Criteria criteria = session.createCriteria(UserModel.class);
			
		
		session.getTransaction();
		
		
		session.close();
		sessionFactory.close();
		
	}

}
