package com.ninja_squad.geektic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.modele.SexeGeek;

@Repository
public class SexeGeekDao {

	@PersistenceContext
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
