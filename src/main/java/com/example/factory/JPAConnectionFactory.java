package com.example.factory;



import com.example.repository.jpa.AlumnoCarreraRepositoryJPA;
import com.example.repository.jpa.AlumnoRepositoryJPA;
import com.example.repository.jpa.CarreraRepositoryJPA;
import com.example.repository.jpa.DireccionRepositoryJPA;
import com.example.entity.AlumnoCarrera;
import com.example.repository.AlumnoCarreraRepository;
import com.example.repository.AlumnoRepository;
import com.example.repository.CarreraRepository;
import com.example.repository.DireccionRepository;
import com.example.repository.jdbc.DireccionRepositoryJDBC;
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
	public AlumnoRepository alumnoRepository() {
		return new AlumnoRepositoryJPA(this.em);
	}

	@Override
	public CarreraRepository carreraRepository() {
		return new CarreraRepositoryJPA(this.em);
	}

	@Override
	public AlumnoCarreraRepository alumnoCarreraRepository() {
		return new AlumnoCarreraRepositoryJPA(em);
	}

	@Override
	public DireccionRepository direccionRepository() {
		return new DireccionRepositoryJPA(em);
	}
}
