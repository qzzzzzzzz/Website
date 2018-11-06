package com.fdmgroup.Website;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class GemDistributionDao {
	
private EntityManagerFactory emf;
	
	public GemDistributionDao(EntityManagerFactory emf) {
		// TODO Auto-generated constructor stub
		this.emf = emf;
	}

	public void add(GemDistribution gemDistributionDao) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(gemDistributionDao);
		et.commit();
		em.close();
	}

	public GemDistribution get(GemDistributionId gdId) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		GemDistribution gemDistributionFromDb = em.find(GemDistribution.class, gdId);
		em.close();
		
		return gemDistributionFromDb;
	}

}
