package com.fdmgroup.Website;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class SearchDao {
	
private EntityManagerFactory emf;
	
	public SearchDao(EntityManagerFactory emf) {
		// TODO Auto-generated constructor stub
		this.emf = emf;
	}

	public void add(Search search) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(search);
		et.commit();
		em.close();
	}

	public Search get(int searchId) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Search searchFromDb = em.find(Search.class, searchId);
		em.close();
		
		return searchFromDb;
	}
	
	public void update(String username, String password, int gender) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		User userFromDb = em.find(User.class, username);
		et.begin();
		userFromDb.setPassword(password);
		userFromDb.setGender(gender);
		et.commit();
		em.close();
	}
	
	public void remove(String username) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		User userFromDb = em.find(User.class, username);
		et.begin();
		em.remove(userFromDb);
		et.commit();
		em.close();
	}


}
