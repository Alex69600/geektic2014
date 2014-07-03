package com.ninja_squad.geektic.modele;

import javax.persistence.*;

@Entity
@Table (name ="GEEK")
public class Geek {
	
	@Id
	@Column(name = "IDGEEK")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idGeek;
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
 	@OneToOne
	@JoinColumn(name = "IDINTERET")
	private CentreInteret CentreInteret;
}
