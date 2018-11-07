package com.fdmgroup.Website;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("website");
		
		GemDistributionDao gdDao = new GemDistributionDao(emf);
		//CountryDao cDao = new CountryDao(emf);

		
		GemDistributionId id1 = new GemDistributionId(7, 17);
		GemDistributionId id2 = new GemDistributionId(7, 9);
		GemDistributionId id3 = new GemDistributionId(5, 5);
		GemDistributionId id4 = new GemDistributionId(5, 3);
		GemDistributionId id5 = new GemDistributionId(10, 12);
		GemDistributionId id6 = new GemDistributionId(10, 20);
		GemDistributionId id7 = new GemDistributionId(9, 6);
		GemDistributionId id8 = new GemDistributionId(9, 9);
		GemDistributionId id9 = new GemDistributionId(20, 1);
		GemDistributionId id10 = new GemDistributionId(20, 17);
		GemDistributionId id11 = new GemDistributionId(2, 3);
		GemDistributionId id12 = new GemDistributionId(2, 17);
		GemDistributionId id13 = new GemDistributionId(4, 20);
		GemDistributionId id14 = new GemDistributionId(4, 11);
		GemDistributionId id15 = new GemDistributionId(11, 20);
		GemDistributionId id16 = new GemDistributionId(11, 4);
		GemDistributionId id17 = new GemDistributionId(16, 1);
		GemDistributionId id18 = new GemDistributionId(16, 17);
		GemDistributionId id19 = new GemDistributionId(12, 20);
		GemDistributionId id20 = new GemDistributionId(12, 10);
		GemDistributionId id21 = new GemDistributionId(1, 3);
		GemDistributionId id22 = new GemDistributionId(1, 15);
		GemDistributionId id23 = new GemDistributionId(8, 15);
		GemDistributionId id24 = new GemDistributionId(8, 3);
		GemDistributionId id25 = new GemDistributionId(13, 20);
		GemDistributionId id26 = new GemDistributionId(13, 1);
		GemDistributionId id27 = new GemDistributionId(3, 20);
		GemDistributionId id28 = new GemDistributionId(3, 17);
		GemDistributionId id29 = new GemDistributionId(18, 10);
		GemDistributionId id30 = new GemDistributionId(18, 6);
		GemDistributionId id31 = new GemDistributionId(17, 1);
		GemDistributionId id32 = new GemDistributionId(17, 6);
		GemDistributionId id33 = new GemDistributionId(15, 14);
		GemDistributionId id34 = new GemDistributionId(15, 19);
		GemDistributionId id35 = new GemDistributionId(19, 20);
		GemDistributionId id36 = new GemDistributionId(19, 3);
		GemDistributionId id37 = new GemDistributionId(6, 20);
		GemDistributionId id38 = new GemDistributionId(6, 16);
		GemDistributionId id39 = new GemDistributionId(14, 2);
		GemDistributionId id40 = new GemDistributionId(14, 8);
		
		GemDistribution gd1 = new GemDistribution(id1, "major");
		GemDistribution gd2 = new GemDistribution(id2, "minor");
		GemDistribution gd3 = new GemDistribution(id3, "major");
		GemDistribution gd4 = new GemDistribution(id4, "minor");
		GemDistribution gd5 = new GemDistribution(id5, "major");
		GemDistribution gd6 = new GemDistribution(id6, "minor");
		GemDistribution gd7 = new GemDistribution(id7, "major");
		GemDistribution gd8 = new GemDistribution(id8, "minor");
		GemDistribution gd9 = new GemDistribution(id9, "major");
		GemDistribution gd10 = new GemDistribution(id10, "minor");
		GemDistribution gd11 = new GemDistribution(id11, "major");
		GemDistribution gd12 = new GemDistribution(id12, "minor");
		GemDistribution gd13 = new GemDistribution(id13, "major");
		GemDistribution gd14 = new GemDistribution(id14, "minor");
		GemDistribution gd15 = new GemDistribution(id15, "major");
		GemDistribution gd16 = new GemDistribution(id16, "minor");
		GemDistribution gd17 = new GemDistribution(id17, "major");
		GemDistribution gd18 = new GemDistribution(id18, "minor");
		GemDistribution gd19 = new GemDistribution(id19, "major");
		GemDistribution gd20 = new GemDistribution(id20, "minor");
		GemDistribution gd21 = new GemDistribution(id21, "major");
		GemDistribution gd22 = new GemDistribution(id22, "minor");
		GemDistribution gd23 = new GemDistribution(id23, "major");
		GemDistribution gd24 = new GemDistribution(id24, "minor");
		GemDistribution gd25 = new GemDistribution(id25, "major");
		GemDistribution gd26 = new GemDistribution(id26, "minor");
		GemDistribution gd27 = new GemDistribution(id27, "major");
		GemDistribution gd28 = new GemDistribution(id28, "minor");
		GemDistribution gd29 = new GemDistribution(id29, "major");
		GemDistribution gd30 = new GemDistribution(id30, "minor");
		GemDistribution gd31 = new GemDistribution(id31, "major");
		GemDistribution gd32 = new GemDistribution(id32, "minor");
		GemDistribution gd33 = new GemDistribution(id33, "major");
		GemDistribution gd34 = new GemDistribution(id34, "minor");
		GemDistribution gd35 = new GemDistribution(id35, "major");
		GemDistribution gd36 = new GemDistribution(id36, "minor");
		GemDistribution gd37 = new GemDistribution(id37, "major");
		GemDistribution gd38 = new GemDistribution(id38, "minor");
		GemDistribution gd39 = new GemDistribution(id39, "major");
		GemDistribution gd40 = new GemDistribution(id40, "minor");
		
		gdDao.add(gd1);
		gdDao.add(gd2);
		gdDao.add(gd3);
		gdDao.add(gd4);
		gdDao.add(gd5);
		gdDao.add(gd6);
		gdDao.add(gd7);
		gdDao.add(gd8);
		gdDao.add(gd9);
		gdDao.add(gd10);
		gdDao.add(gd11);
		gdDao.add(gd12);
		gdDao.add(gd13);
		gdDao.add(gd14);
		gdDao.add(gd15);
		gdDao.add(gd16);
		gdDao.add(gd17);
		gdDao.add(gd18);
		gdDao.add(gd19);
		gdDao.add(gd20);
		gdDao.add(gd21);
		gdDao.add(gd22);
		gdDao.add(gd23);
		gdDao.add(gd24);
		gdDao.add(gd25);
		gdDao.add(gd26);
		gdDao.add(gd27);
		gdDao.add(gd28);
		gdDao.add(gd29);
		gdDao.add(gd30);
		gdDao.add(gd31);
		gdDao.add(gd32);
		gdDao.add(gd33);
		gdDao.add(gd34);
		gdDao.add(gd35);
		gdDao.add(gd36);
		gdDao.add(gd37);
		gdDao.add(gd38);
		gdDao.add(gd39);
		gdDao.add(gd40);
		//EntityManager em = emf.createEntityManager();
		
		
				
	}

}
