package tutorial.hibernate.projection.api.main;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

import tutorial.hibernate.projection.api.main.model.UserModel;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
			Criteria criteria = session.createCriteria(UserModel.class)
					.setProjection(Projections.property("nameUser"))
					.addOrder(Order.desc("nameUser"));
			criteria.setMaxResults(20);
			
			
			ArrayList<String> userListString  = (ArrayList<String>) criteria.list();
			
			criteria = null;
			
			
			UserModel objectUser = new UserModel();
			//objectUser.setUserId(155);
			objectUser.setNameUser("%User_Name15%");
			
			Example example = Example.create(objectUser).enableLike();
			
			criteria = session.createCriteria(UserModel.class)
					.add(example);
			
			
			ArrayList<UserModel> userListObject = (ArrayList<UserModel>) criteria.list();
			
			criteria = null;
			example =null;
						
			
			
			criteria = session.createCriteria(UserModel.class);
			objectUser.setSurnameUser("Surname%");
			objectUser.setNameUser("Projection_User_Name14%");
			
			example = Example.create(objectUser).enableLike();
			criteria = session.createCriteria(UserModel.class)
					.add(example);
			
			ArrayList<UserModel> userModelList = (ArrayList<UserModel>) criteria.list();
			
		session.beginTransaction().commit();
		session.close();
		
		for (String u: userListString) {
			System.out.println(u);
		}
		
		System.out.println("________________________________________________");
		
		for (UserModel u: userListObject) {
			System.out.println(" " + u.getSurnameUser());
		}
		
		System.out.println("__________************************____________________");
		
		
		for (UserModel u: userModelList) {
			System.out.println("    " + u.getNameUser() + " "+ u.getSurnameUser() + "  " + u.getNumberPhone());
		}
		
		sessionFactory.close();
		
	}
}
