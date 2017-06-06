package com.rcmutha.HibernateSample;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rcmutha.HibernateSample.model.Address;
import com.rcmutha.HibernateSample.model.EmployeeEntity;

public class App {
	/*public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// Add new Employee object
			EmployeeEntity emp = new EmployeeEntity();
			emp.setEmail("roshan13@gmail.com");
			emp.setFirstName("Roshan");
			emp.setLastName("Mutha");
			session.save(emp);
			//session.cre
			Criteria createCriteria = session.createCriteria(EmployeeEntity.class);
			List list = createCriteria.list();
			System.out.println(list.size());
			EmployeeEntity emp1 = new EmployeeEntity();
			emp1.setEmail("roshan13@gmail.com");
			emp1.setFirstName("Roshan");
			//emp1.setLastName("Mutha");
			session.save(emp1);
			//session.persist(emp);//uncommant for transaction rollback.
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		HibernateUtil.shutdown();
	}*/
	
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// Add new Employee object
			EmployeeEntity emp = new EmployeeEntity();
			emp.setEmail("roshan13@gmail.com");
			emp.setFirstName("Roshan");
			emp.setLastName("Mutha");
			//embadabble
			Address add= new Address("pune","lohegaon road","411047");
			Address home= new Address("punehome","lohegaon road","411047");
			emp.setAddress(add);
			emp.setHomeaddress(home);
			//emp.getAddresses().add(add);
			//emp.getAddresses().add(home);
			session.save(emp);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		session=null;
	    session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx1 = null;
		try {
			tx1 = session.beginTransaction();
			// Add new Employee object
			EmployeeEntity emp = (EmployeeEntity)session.get(EmployeeEntity.class, 1);
			System.out.println(emp.toString());
			tx1.commit();
		} catch (Exception e) {
			if (tx1 != null)
				tx1.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		HibernateUtil.shutdown();
	}
}
