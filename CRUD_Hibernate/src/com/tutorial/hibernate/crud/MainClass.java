package com.tutorial.hibernate.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tutorial.hibernate.crud.model.UserModel;

public class MainClass {
	
	public static void main(String[] args) {
				
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
			String minUserId = "5";
			String userName = " NameUser N10";
			
			
			Query query = session.createQuery("from UserModel where idUser > ? and nameUser = ?");
			query.setInteger(0, Integer.parseInt(minUserId));
			query.setString(1, userName);
			
			//query.setFirstResult(3);
			//query.setMaxResults(4);
			
			List<UserModel> userList = (List<UserModel>) query.list();
			
			
			
			
			
			int intMinId = 9;
			userName = "Richard";
			
			query = session.createQuery("from UserModel where idUser > :idUser or nameUser = :nameUser");
			query.setInteger("idUser", intMinId);
			query.setString("nameUser", userName);
			
			userList.addAll(query.list());
		
			
			
			
			query = session.getNamedQuery("UserModel.byId");
			query.setInteger("idUser", 1);
			userList.addAll(query.list());
			
			
			
			query = session.getNamedQuery("sql_UserModel.byName");
			query.setString("nameUser", " NameUser N2");
			userList.addAll(query.list());
			
		session.beginTransaction().commit();
		session.close();
		
		
		for (UserModel u: userList) {
			System.out.println(u.getNameUser());
		}
		
		System.out.println("Size of list result = " + userList.size());
	}

}
