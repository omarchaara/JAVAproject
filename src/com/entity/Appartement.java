package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Appartement {
	@Id 
	@GeneratedValue
	private int lettre_appartement ;
	
	@Column
	private int nb_piecestotal ;

	public Appartement() {
		super();
	}

	public Appartement(int lettre_appartement, int nb_piecestotal) {
		super();
		this.lettre_appartement = lettre_appartement;
		this.nb_piecestotal = nb_piecestotal;
	}

	public int getLettre_appartement() {
		return lettre_appartement;
	}

	public void setLettre_appartement(int lettre_appartement) {
		this.lettre_appartement = lettre_appartement;
	}

	public int getNb_piecestotal() {
		return nb_piecestotal;
	}

	public void setNb_piecestotal(int nb_piecestotal) {
		this.nb_piecestotal = nb_piecestotal;
	}

}
