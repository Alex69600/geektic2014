package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
	
	public List<SexeGeek> findByAll() //retourne tous les sexes
	{
		String jpql = "select s from SexeGeek as s ORDER BY sexeGeek"; 
		TypedQuery<SexeGeek> query = entityManager.createQuery(jpql, SexeGeek.class); 
		List<SexeGeek> listeSexeGeek= query.getResultList();
		return listeSexeGeek;
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
