package com.ninja_squad.geektic.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name ="CENTREINTERET")
public class CentreInteret {

	@Id
	@SequenceGenerator(name="SEQ", sequenceName="centreInteret_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ")
    private Long idInteret;
	@Column(name = "NOMINTERET")
	private String nomInteret;
}
