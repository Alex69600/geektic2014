package com.ninja_squad.geektic.modele;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class GeekDAO {
	
private EntityManager entityManager;
	
	public GeekDAO(EntityManager entityManager)
	{
		this.entityManager = entityManager;
	}
	
	public List<Geek> findAll() // retourne tous les geeks
	{
		String jpql = "select s from Geek as s ORDER BY Nom,Prenom"; 
		TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class); 
		List<Geek> listeGeeks = query.getResultList();
		return listeGeeks;
	}
	
	public List<Geek> findCritere(Long idInteret,Long idSexe ) // retourne les geeks correspondants aux critères
	{
		String jpql = "select s from Geek as s WHERE "
				+ " NUMCENTREINTERET=" + idInteret
				+ " NUMSEXE=" + idSexe
				+ " ORDER BY Nom,Prenom"; 
		TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class); 
		List<Geek> listeGeeks = query.getResultList();
		return listeGeeks;
	}
	
	public Geek findById(Long id) //retourne un geek
	{
		return entityManager.find(Geek.class, id);
	}
	
	public void persists(Geek g)
	{
		entityManager.persist(g);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
