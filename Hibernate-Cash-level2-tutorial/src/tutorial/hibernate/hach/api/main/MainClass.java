package tutorial.hibernate.hach.api.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tutorial.hibernate.hach.api.main.model.UserModel;

public class MainClass {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		UserModel user = (UserModel) session.get(UserModel.class, 1);
				
		session.beginTransaction().commit();
		session.close();
		
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		UserModel user2 = (UserModel) session2.get(UserModel.class, 1);
		
		session2.beginTransaction().commit();
		session2.close();
	}
}
