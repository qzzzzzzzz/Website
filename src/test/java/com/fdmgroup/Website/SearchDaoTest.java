package com.fdmgroup.Website;

import static org.mockito.Mockito.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.junit.Test;
import org.mockito.InOrder;

public class SearchDaoTest {
	
	@Test
	public void adding_user_persists_and_cleans_up_resources() {
		
		//arrange
		EntityManagerFactory mockEmf = mock(EntityManagerFactory.class);
		EntityManager mockEm = mock(EntityManager.class);
		EntityTransaction mockEt = mock(EntityTransaction.class);
		Search mockSearch = mock(Search.class);
		when(mockEmf.createEntityManager()).thenReturn(mockEm);
		when(mockEm.getTransaction()).thenReturn(mockEt);
		
		//act
		SearchDao sDao = new SearchDao(mockEmf);
		sDao.add(mockSearch);
		
		
		//assert
		verify(mockEmf).createEntityManager();
		verify(mockEm).getTransaction();
		verify(mockEt).begin();
		verify(mockEm).persist(mockSearch);
		verify(mockEt).commit();
		verify(mockEm).close();
		
	}
	
	@Test
	public void getting_user_retrievers_user_and_cleans_up_resources() {
		
		//arrange
		EntityManagerFactory mockEmf = mock(EntityManagerFactory.class);
		EntityManager mockEm = mock(EntityManager.class);
		EntityTransaction mockEt = mock(EntityTransaction.class);
		Search mockUser = mock(Search.class);
		when(mockEmf.createEntityManager()).thenReturn(mockEm);
		when(mockEm.getTransaction()).thenReturn(mockEt);
		
		//act
		SearchDao sDao = new SearchDao(mockEmf);
		sDao.get(1);
		
		//assert
		InOrder order = inOrder(mockEmf, mockEm);
		order.verify(mockEmf).createEntityManager();
		order.verify(mockEm).find(Search.class, 1);
		order.verify(mockEm).close();
		
	}

}
