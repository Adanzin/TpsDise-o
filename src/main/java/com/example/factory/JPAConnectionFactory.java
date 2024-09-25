package com.example.factory;



import com.example.repository.jpa.AlumnoRepositoryJPA;
import com.example.utils.Config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAConnectionFactory extends ConnectionFactory {
	private EntityManager em;
	private EntityManagerFactory emf;

	public JPAConnectionFactory() {
	}

	@Override
	public void connect() {
		String type = "";
		this.emf = Persistence.createEntityManagerFactory(Config.getInstance().getProperty("jpa.source"));
		this.em = emf.createEntityManager();

	}

	public void disconnect() {
		this.emf.close();
		this.em.close();
	}

	@Override
	public AlumnoRepositoryJPA alumnoRepository() {
		return new AlumnoRepositoryJPA(this.em);
	}
}
