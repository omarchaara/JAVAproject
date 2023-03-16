package com.entity;

import org.hibernate.Session;

import org.hibernate.Transaction;


public class Main {

	public static void main(String[] args) {

		Rue Rue = new Rue();
		Rue.setNom_rue("haysalam");
		
		Appartement Appartement = new Appartement();
		Appartement.setNb_piecestotal(0);
		
		Etage Etage = new Etage();
		Etage.setNb_appartements_tot(11);
		
		Immeuble Immeuble = new Immeuble();
		Immeuble.setNb_etage_total(12);
		
		Session session = Hibernatconf.getSessionfactory().getCurrentSession();
		Transaction tr = session .beginTransaction();
		session.save(Appartement);
		session.save(Rue);
		session.save(Etage);
		session.save(Immeuble);
		
		
		tr.commit();
		session.close();

	}

}