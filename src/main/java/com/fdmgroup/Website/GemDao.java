package com.fdmgroup.Website;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class GemDao {
	
	private EntityManagerFactory emf;
	
	public GemDao(EntityManagerFactory emf) {
		// TODO Auto-generated constructor stub
		this.emf = emf;
	}

	public void add(Gem gem) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(gem);
		et.commit();
		em.close();
	}

	public Gem get(String gemName) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Gem gemFromDb = em.find(Gem.class, gemName);
		em.close();
		
		return gemFromDb;
	}


}
