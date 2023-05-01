package org.localproject.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.localproject.main.model.FireArms;
import org.localproject.main.model.FourWheelerModel;
import org.localproject.main.model.MeleeWeapon;
import org.localproject.main.model.ModelUser;
import org.localproject.main.model.ModelVehicle;
import org.localproject.main.model.TwoWheelerModel;
import org.localproject.main.model.Weapon;

public class MainClass {
	public static void main(String[] args) {
				
		ModelUser user = new ModelUser();
		user.setUserName("Lion");
		
		ModelVehicle vehicle = new ModelVehicle();
		vehicle.setNameVehicle("Cirrus Vision Jet");
		
		TwoWheelerModel twoWheeler = new TwoWheelerModel();
		twoWheeler.setNameVehicle("Motorcycle");
		twoWheeler.setSteeringHandle("Steering");
		
		FourWheelerModel fourWheeler = new FourWheelerModel();
		fourWheeler.setNameVehicle("Lamborghini");
		fourWheeler.setSteeringWheel("Lamborghini Steering Wheel");
		
		
		user.getForeignIdUser().add(vehicle);
		user.getForeignIdUser().add(twoWheeler);
		user.getForeignIdUser().add(fourWheeler);
		
		
		Weapon weapon = new Weapon();
		weapon.setWeaponName("Magic Weapon");
		
		FireArms fireArms = new FireArms();
		fireArms.setWeaponName("revolver S&W");
		fireArms.setCaliber("357 magnum");
		
		MeleeWeapon meleeWeapon = new MeleeWeapon();
		meleeWeapon.setWeaponName("dagger");
		meleeWeapon.setDamageType("stabbing and cutting");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(user);
		session.save(weapon);
		session.save(fireArms);
		session.save(meleeWeapon);
		
		session.beginTransaction().commit();
		session.close();
		sessionFactory.close();
		
		
		
	}
}
