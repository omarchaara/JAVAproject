package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Etage {
	@Id 
	@GeneratedValue
	private int num_etage ;
	
	@Column
	private int nb_appartements_tot ;

	public Etage() {
		super();
	}

	public Etage(int num_etage, int nb_appartements_tot) {
		super();
		this.num_etage = num_etage;
		this.nb_appartements_tot = nb_appartements_tot;
	}

	public int getNum_etage() {
		return num_etage;
	}

	public void setNum_etage(int num_etage) {
		this.num_etage = num_etage;
	}

	public int getNb_appartements_tot() {
		return nb_appartements_tot;
	}

	public void setNb_appartements_tot(int nb_appartements_tot) {
		this.nb_appartements_tot = nb_appartements_tot;
	}
	

}
