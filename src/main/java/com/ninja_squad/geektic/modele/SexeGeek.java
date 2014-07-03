package com.ninja_squad.geektic.modele;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name ="SEXEGEEK")
public class SexeGeek {
	@Id
	@Column(name = "IDSEXEGEEK")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idSexeGeek;
	@Column(name = "SEXEGEEK")
	private String sexeGeek;
	@OneToMany(mappedBy = "sexeGeek")
	private Set<Geek> geek;
	
	public Long getIdSexeGeek() {
		return idSexeGeek;
	}
	public void setIdSexeGeek(Long idSexeGeek) {
		this.idSexeGeek = idSexeGeek;
	}
	public String getSexeGeek() {
		return sexeGeek;
	}
	public void setSexeGeek(String sexeGeek) {
		this.sexeGeek = sexeGeek;
	}
	public Set<Geek> getGeek() {
		return geek;
	}
	public void setGeek(Set<Geek> geek) {
		this.geek = geek;
	}
}
