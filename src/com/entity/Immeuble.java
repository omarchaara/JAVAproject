package com.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table

public class Immeuble {
	@Id 
	@GeneratedValue
	private int num_Immeuble ;
	
	@Column
	private int nb_etage_total ;
	
	
	

	public Immeuble() {
		super();
	}

	public Immeuble(int num_Immeuble, int nb_etage_total) {
		super();
		this.num_Immeuble = num_Immeuble;
		this.nb_etage_total = nb_etage_total;
	}

	public int getNum_Immeuble() {
		return num_Immeuble;
	}

	public void setNum_Immeuble(int num_Immeuble) {
		this.num_Immeuble = num_Immeuble;
	}

	public int getNb_etage_total() {
		return nb_etage_total;
	}

	public void setNb_etage_total(int nb_etage_total) {
		this.nb_etage_total = nb_etage_total;
	}

}
