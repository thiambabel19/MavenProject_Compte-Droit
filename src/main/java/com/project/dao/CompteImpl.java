package com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.project.config.JpaUtil;
import com.project.dto.Compte;

public class CompteImpl implements ICompte{

	private EntityManager em;
	private EntityTransaction transaction;
	
	public CompteImpl() {
		em = JpaUtil.getEntityManager("Project_JPA");
		transaction = em.getTransaction();
	}

	@Override
	public Compte saveComptes(Compte c) {
		try {
			transaction.begin();
			em.persist(c);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public Compte getCompteById(int id) {

		return em.find(Compte.class, id);
	
	}

	@Override
	public Compte updateComptes(Compte compte) {
		try {
			transaction.begin();
			em.merge(compte);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return compte;
		
	}

	@Override
	public void  removeCompte(int id) {
		try {
			transaction.begin();
			Compte c = em.find(Compte.class, id);
			em.remove(c);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Compte> getAllComptes() {
		@SuppressWarnings("unchecked")
		List<Compte> comptes = em.createQuery("select c from Compte c order by c.id").getResultList();
		return comptes;
	}

	@Override
	public Compte login(String username, String password) throws Exception{
		
		Query q = em.createQuery("FROM Compte c WHERE c.username='"+username+"' and c.password='"+password+"'");
		
		Compte c = (Compte)q.getSingleResult();
		
		if(c == null) {
			throw new Exception("Login failed");
		}else {
			System.out.println("ok");
		}
		return c;
	}
	
}
