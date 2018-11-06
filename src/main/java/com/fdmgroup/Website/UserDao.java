package com.fdmgroup.Website;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class UserDao {
	
	private EntityManagerFactory emf;
	
	public UserDao(EntityManagerFactory emf) {
		// TODO Auto-generated constructor stub
		this.emf = emf;
	}

	public void add(User user) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(user);
		et.commit();
		em.close();
	}

	public User get(String email) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		User userFromDb = em.find(User.class, email);
		em.close();
		
		return userFromDb;
	}

}
