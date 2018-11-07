package com.fdmgroup.Website;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class CountryDao {
	
private EntityManagerFactory emf;
	
	public CountryDao(EntityManagerFactory emf) {
		// TODO Auto-generated constructor stub
		this.emf = emf;
	}

	public void add(Country country) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(country);
		et.commit();
		em.close();
	}

	public Country get(String countryName) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Country countryFromDb = em.find(Country.class, countryName);
		em.close();
		
		return countryFromDb;
	}
	
	public void update(String name, String newMap) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Country countryFromDb = em.find(Country.class, name);
		et.begin();
		countryFromDb.setCountryMap(newMap);
		et.commit();
		em.close();
	}
	
	public void remove(String name) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Country countryFromDb = em.find(Country.class, name);
		et.begin();
		em.remove(countryFromDb);
		et.commit();
		em.close();
	}

}
