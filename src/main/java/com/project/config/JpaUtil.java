package com.project.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManager em;
	private static EntityManagerFactory emf;
	
	public static EntityManager getEntityManager(String persisUnit) {
		
		if(em == null) {
			emf = Persistence.createEntityManagerFactory(persisUnit);
			em = emf.createEntityManager();
		}
		
		return em;
	}
}
