package org.itutorials.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.itutorials.hibernate.model.Address;
import org.itutorials.hibernate.model.FireArms;
import org.itutorials.hibernate.model.Phone;
import org.itutorials.hibernate.model.UserModel;
import org.itutorials.hibernate.model.Vehicle;
import org.itutorials.hibernate.model.ProfitModel;

public class MainMyClass {
	
	public static void main(String[] args) {
				
		UserModel user = new UserModel();
		//user.setUserId(1);
		user.setNameUser("Aleksey");
		user.setJoinDate(new Date());
		user.setDescription("description .....");
		
		Address addressUser = new Address();
		addressUser.setCity("Votkinsk");
		addressUser.setStreet("Mira-44");
		addressUser.setState("it's not state");
		addressUser.setPincode("7");
		
		user.setHomeAddress(addressUser);
		
		
		Address addressUser2 = new Address();
		addressUser2.setCity("Moskoy");
		addressUser2.setStreet("Iamskay-789");
		addressUser2.setState("not state/ central district");
		addressUser2.setPincode("123");
		
		user.setOfficeAddress(addressUser2);
		
		Phone phone1 = new Phone();
		phone1.setNumberPhone("+7(999)77-22-5-22");
		phone1.setMarkPhone("Samsung Galaxy S-51");
		
		Phone phone2 = new Phone();
		phone2.setNumberPhone("+14(888)114-225-224-25");
		phone2.setMarkPhone("Aple");
		
		user.getListOfPhone().add(phone1);
		user.getListOfPhone().add(phone2);
		
		
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("car: Tesla S-5");
		user.setVehicle(vehicle);
		
		
		ProfitModel profit = new ProfitModel();
		profit.setProfitName("Business - enterprise");
		profit.setAmountProfit(78961561);
		
		
		ProfitModel profit2 = new ProfitModel();
		profit2.setProfitName("Deposits and investments");
		profit2.setAmountProfit(546789);
		
		user.getProfitModel().add(profit);
		user.getProfitModel().add(profit2);
		
		profit.setUser(user);
		profit2.setUser(user);
		
		FireArms fireArms = new FireArms();
		fireArms.setUser(user);
		fireArms.setFireArmsName("revolver, 357-magnum, Smith and Wesson");
		fireArms.setSerialNumber("SW-357mg 901234");
		
		FireArms fireArms2 = new FireArms();
		fireArms2.setFireArmsName("pistol, 1911-colt-45, Smith and Wesson");
		fireArms2.setSerialNumber("SW-1911/colt45 78456");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(fireArms);
		session.save(fireArms2);
		session.save(vehicle);
		session.persist(user);
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
	}
}
