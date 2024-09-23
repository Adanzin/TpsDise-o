package com.example.dao;

import jakarta.persistence.EntityManager;

import com.example.dao.mysql.*;
import com.example.util.ConnectionFactory;

public class DAOFactory {

	public DAOFactory() {
	}

	public static AlumnoDAO getPersonaDAO(String type) {
		if (type.equals(ConnectionFactory.MYSQL)) {
			EntityManager em = ConnectionFactory.getInstance().connect(ConnectionFactory.MYSQL);
			return new AlumnoDAOMySQL(em);
		} else if (type.equals(ConnectionFactory.DERBY)) {
			// Aca deberia implementar DERBY
			EntityManager em = ConnectionFactory.getInstance().connect(ConnectionFactory.DERBY);
			return new AlumnoDAOMySQL(em);
		} else {
			throw new IllegalArgumentException("Tipo de DAO no válido: " + type);
		}
	}

	// otros métodos para obtener instancias de DAOs
}
