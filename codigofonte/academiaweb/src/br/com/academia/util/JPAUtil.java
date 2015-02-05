package br.com.academia.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("academia");

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
