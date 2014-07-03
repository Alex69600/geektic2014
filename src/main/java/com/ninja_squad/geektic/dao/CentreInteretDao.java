package com.ninja_squad.geektic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.modele.CentreInteret;

@Repository
public class CentreInteretDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public CentreInteret findById(Long id) //retourne un centre d'interet
	{
		return entityManager.find(CentreInteret.class, id);
	}
	
	public void persists(CentreInteret ci)
	{
		entityManager.persist(ci);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
