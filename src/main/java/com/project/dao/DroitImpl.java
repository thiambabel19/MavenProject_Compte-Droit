package com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.project.config.JpaUtil;
import com.project.dto.Droit;

public class DroitImpl implements IDroit{

	private EntityManager em;
	private EntityTransaction transaction;
	
	public DroitImpl() {
		em = JpaUtil.getEntityManager("Project_JPA");
		transaction = em.getTransaction();
	}

	@Override
	public Droit saveDroit(Droit d) {
		try {
			transaction.begin();
			em.persist(d);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	@Override
	public Droit getDroitById(int id) {
		return em.find(Droit.class, id);
	}

	@Override
	public Droit updateDroit(Droit d) {
		try {
			transaction.begin();
			em.merge(d);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	@Override
	public void removeDroit(int id) {
		try {
			transaction.begin();
			Droit d = em.find(Droit.class, id);
			em.remove(d);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Droit> getAllDroit() {
		@SuppressWarnings("unchecked")
		List<Droit> droits = em.createQuery("select d from Droit d order by d.id").getResultList();
		return droits;
	}
	
}
