package com.example;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import com.example.factory.ConnectionFactory;
import com.example.factory.JDBCConnectionFactory;
import com.example.factory.JPAConnectionFactory;
import com.example.modelo.Alumno;
import com.example.utils.Config;

public class Main
{
    public static ConnectionFactory getConnectionFactory() {
        if (Config.getInstance().getProperty("connection.type") == "JPA") {
            return new JPAConnectionFactory();
        } else {
            return new JDBCConnectionFactory();
        }
    }

    public static void main( String[] args )
    {
        ConnectionFactory connFactory = getConnectionFactory();
        connFactory.alumnoRepository().delete(new Alumno());;
        
    }
}

