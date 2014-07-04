package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.modele.Geek;

@Repository
public class GeekDao {

	@PersistenceContext
	private EntityManager entityManager;
		
	public List<Geek> findByAll() // retourne tous les geeks
	{
		String jpql = "select s from Geek as s ORDER BY Nom,Prenom"; 
		TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class); 
		List<Geek> listeGeeks = query.getResultList();
		return listeGeeks;
	}
	
	public List<Geek> findCritere(long interet,long sexe ) // retourne les geeks correspondants aux crit�res
	{
		String jpql = "select g from Geek as g"
				+ " inner join g.centreInteret as i"
				+ " inner join g.sexeGeek as s"
                + " where  s.idSexeGeek= :sexe and  i.idInteret= :interet";
        TypedQuery<Geek> query = entityManager.createQuery(jpql, Geek.class);
        query.setParameter("sexe", sexe);
        query.setParameter("interet", interet);
        
        return query.getResultList();
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
