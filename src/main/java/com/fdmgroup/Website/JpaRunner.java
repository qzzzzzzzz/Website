package com.fdmgroup.Website;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("website");
		
		GemDistributionDao gdDao = new GemDistributionDao(emf);
		
		GemDistribution gd1 = new GemDistribution(new GemDistributionId(1, 2), "aaa");
		GemDistribution gd2 = new GemDistribution(new GemDistributionId(1, 3), "bbb");
		GemDistribution gd3 = new GemDistribution(new GemDistributionId(2, 4), "ccc");
		
		gdDao.add(gd1);
		gdDao.add(gd2);
		gdDao.add(gd3);
				
	}

}
