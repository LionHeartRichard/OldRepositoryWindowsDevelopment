package tutorial.hibernate.criteria.api.main;


import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import tutorial.hibernate.criteria.api.main.model.UserModel;

public class MainClass {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
			Criteria criteria = session.createCriteria(UserModel.class);
			criteria.add(Restrictions.eq("nameUser", "Name77"))
					.add(Restrictions.gt("userId", 5));
			
			ArrayList<UserModel> arListUser = (ArrayList<UserModel>) criteria.list();
			
			criteria = null;
			criteria = session.createCriteria(UserModel.class);
			
			criteria.setMaxResults(20);
			criteria.add(Restrictions.gt("userId", 50))
					.add(Restrictions.like("surnameUser", "%Surname%1%"));
			
			arListUser.addAll(criteria.list());
		
			criteria = null;
			criteria = session.createCriteria(UserModel.class);
			criteria.add(Restrictions.between("userId", 20, 40));
		
			arListUser.addAll(criteria.list());
			
			criteria = null;
			criteria = session.createCriteria(UserModel.class);
			criteria.add(Restrictions.or(
					Restrictions.eq("userId", 1), 
					Restrictions.like("surnameUser", "%7%"))
					);
			
			arListUser.addAll(criteria.list());
		
		session.beginTransaction().commit();
		session.close();
		
		for (UserModel u: arListUser) {
			System.out.println("__" + u.getUserId() + " " + u.getNameUser() + " " + u.getSurnameUser() + " " + u.getNamberPhone());
		}
	}
}
