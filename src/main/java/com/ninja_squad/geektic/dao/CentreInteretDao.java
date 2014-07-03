package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
	
	public List<CentreInteret> findByAll() //retourne tous les centres d'interets
	{
		String jpql = "select c from CentreInteret as c ORDER BY c.nomInteret"; 
		TypedQuery<CentreInteret> query = entityManager.createQuery(jpql, CentreInteret.class); 
		List<CentreInteret> listeCentreInteret = query.getResultList();
		return listeCentreInteret;
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
