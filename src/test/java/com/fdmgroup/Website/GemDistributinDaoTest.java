package com.fdmgroup.Website;

import static org.mockito.Mockito.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.junit.Test;
import org.mockito.InOrder;

public class GemDistributinDaoTest {
	
	@Test
	public void adding_user_persists_and_cleans_up_resources() {
		
		//arrange
		EntityManagerFactory mockEmf = mock(EntityManagerFactory.class);
		EntityManager mockEm = mock(EntityManager.class);
		EntityTransaction mockEt = mock(EntityTransaction.class);
		GemDistribution mockGemDistribution = mock(GemDistribution.class);
		when(mockEmf.createEntityManager()).thenReturn(mockEm);
		when(mockEm.getTransaction()).thenReturn(mockEt);
		
		//act
		GemDistributionDao gdDao = new GemDistributionDao(mockEmf);
		gdDao.add(mockGemDistribution);
		
		
		//assert
		verify(mockEmf).createEntityManager();
		verify(mockEm).getTransaction();
		verify(mockEt).begin();
		verify(mockEm).persist(mockGemDistribution);
		verify(mockEt).commit();
		verify(mockEm).close();
		
	}
	
	@Test
	public void getting_user_retrievers_user_and_cleans_up_resources() {
		
		//arrange
		EntityManagerFactory mockEmf = mock(EntityManagerFactory.class);
		EntityManager mockEm = mock(EntityManager.class);
		EntityTransaction mockEt = mock(EntityTransaction.class);
		GemDistribution mockGemDistribution = mock(GemDistribution.class);
		when(mockEmf.createEntityManager()).thenReturn(mockEm);
		when(mockEm.getTransaction()).thenReturn(mockEt);
		
		//act
		GemDistributionDao gdDao = new GemDistributionDao(mockEmf);
		GemDistributionId gdId = new GemDistributionId();
		gdId.setGemId(1);
		gdId.setCountryId(1);
		gdDao.get(gdId);
		
		//assert
		InOrder order = inOrder(mockEmf, mockEm);
		order.verify(mockEmf).createEntityManager();
		order.verify(mockEm).find(GemDistribution.class, gdId);
		order.verify(mockEm).close();
		
	}

}
