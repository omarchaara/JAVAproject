package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Rue {
	@Id 
	@GeneratedValue
	private int code_rue ;
	
	@Column
	private String nom_rue ;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_FIL")
	private Immeuble Immeuble;

	

	public Immeuble getImmeuble() {
		return Immeuble;
	}

	public void setImmeuble(Immeuble immeuble) {
		Immeuble = immeuble;
	}

	public int getCode_rue() {
		return code_rue;
	}

	public void setCode_rue(int code_rue) {
		this.code_rue = code_rue;
	}

	public String getNom_rue() {
		return nom_rue;
	}

	public void setNom_rue(String nom_rue) {
		this.nom_rue = nom_rue;
	}

	public Rue(int code_rue, String nom_rue) {
		super();
		this.code_rue = code_rue;
		this.nom_rue = nom_rue;
	}

	public Rue() {
		super();
	}
	
	
	

}
