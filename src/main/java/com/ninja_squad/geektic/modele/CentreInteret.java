package com.ninja_squad.geektic.modele;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name ="CENTREINTERET")
public class CentreInteret {

	@Id
	@Column(name = "IDINTERET")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idInteret;
	@Column(name = "NOMINTERET")
	private String nomInteret;
	@OneToMany(mappedBy = "centreInteret")
	private Set<Geek> geek;
	
	public Set<Geek> getGeek() {
		return geek;
	}
	public void setGeek(Set<Geek> geek) {
		this.geek = geek;
	}
	public Long getIdInteret() {
		return idInteret;
	}
	public void setIdInteret(Long idInteret) {
		this.idInteret = idInteret;
	}
	public String getNomInteret() {
		return nomInteret;
	}
	public void setNomInteret(String nomInteret) {
		this.nomInteret = nomInteret;
	}
	
}
