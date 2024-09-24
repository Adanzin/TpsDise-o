package com.example.dao;

import jakarta.persistence.EntityManager;

import com.example.dao.mysql.*;
import com.example.factory.JPAConnectionFactory;

public class DAOFactory {

	public DAOFactory() {
	}

	// public static AlumnoDAO getPersonaDAO(String type) {
	// 	if (type.equals(JPAConnectionFactory.MYSQL)) {
	// 		//EntityManager em = JPAConnectionFactory.getInstance().connect(JPAConnectionFactory.MYSQL);
	// 		//return new AlumnoDAOMySQL(em);
	// 	} else if (type.equals(JPAConnectionFactory.DERBY)) {
	// 		// Aca deberia implementar DERBY
	// 		//EntityManager em = JPAConnectionFactory.getInstance().connect(JPAConnectionFactory.DERBY);
	// 		//return new AlumnoDAOMySQL(em);
	// 	} else {
	// 		throw new IllegalArgumentException("Tipo de DAO no válido: " + type);
	// 	}
	// }

	// otros métodos para obtener instancias de DAOs
}
