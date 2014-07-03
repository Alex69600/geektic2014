package com.ninja_squad.geektic.modele;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class SexeGeek {
	@Id
	@SequenceGenerator(name="SEQ", sequenceName="sexeGeek_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ")
    private Long idSexeGeek;
	@Column(name = "SEXEGEEK")
	private String sexeGeek;
}
