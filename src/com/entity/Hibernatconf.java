package com.entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Hibernatconf {
	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;

	static {
		Configuration config = new Configuration();
		config.configure();

		config.addAnnotatedClass(Rue.class);
		config.addAnnotatedClass(Appartement.class);
		config.addAnnotatedClass(Etage.class);
		config.addAnnotatedClass(Immeuble.class);
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
