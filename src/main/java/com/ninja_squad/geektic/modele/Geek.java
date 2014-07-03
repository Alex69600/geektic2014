package com.ninja_squad.geektic.modele;

import javax.persistence.*;

@Entity
@Table (name ="GEEK")
public class Geek {
	
	@Id
	@Column(name = "IDGEEK")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idGeek;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "AGE")
	private Integer age;
	@Column(name = "COURRIEL")
	private String courriel;
	@Column(name = "GRAVATAR")
	private String gravatar;
 	@ManyToOne
	@JoinColumn(name = "NUMCENTREINTERET")
	private CentreInteret centreInteret;
 	@ManyToOne
	@JoinColumn(name = "NUMSEXE")
	private SexeGeek sexeGeek;
 	
	public long getIdGeek() {
		return idGeek;
	}
	public SexeGeek getSexeGeek() {
		return sexeGeek;
	}
	public void setSexeGeek(SexeGeek sexeGeek) {
		this.sexeGeek = sexeGeek;
	}
	public void setIdGeek(int idGeek) {
		this.idGeek = idGeek;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCourriel() {
		return courriel;
	}
	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}
	public String getGravatar() {
		return gravatar;
	}
	public void setGravatar(String gravatar) {
		this.gravatar = gravatar;
	}
	public CentreInteret getCentreInteret() {
		return centreInteret;
	}
	public void setCentreInteret(CentreInteret centreInteret) {
		this.centreInteret = centreInteret;
	}
}
