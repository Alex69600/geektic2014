package com.ninja_squad.geektic.modele;

import javax.persistence.EntityManager;

public class CentreInteretDAO {
	
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
