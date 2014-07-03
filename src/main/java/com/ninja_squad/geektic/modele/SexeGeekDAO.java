package com.ninja_squad.geektic.modele;

import javax.persistence.EntityManager;

public class SexeGeekDAO {

private EntityManager entityManager;
	
	public SexeGeek findById(Long id) //retourne un sexe
	{
		return entityManager.find(SexeGeek.class, id);
	}
	
	public void persists(SexeGeek sg)
	{
		entityManager.persist(sg);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
