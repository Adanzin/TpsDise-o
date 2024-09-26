package com.example.factory;

import com.example.repository.jpa.AlumnoRepositoryJPA;
import com.example.entity.AlumnoCarrera;
import com.example.repository.AlumnoCarreraRepository;
import com.example.repository.AlumnoRepository;
import com.example.repository.CarreraRepository;
import com.example.repository.DireccionRepository;

public class JDBCConnectionFactory extends ConnectionFactory {

    // Se obvio la implementacion en JDBC

    @Override
    public AlumnoRepository alumnoRepository() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alumnoRepository'");
    }

    @Override
    public void connect() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connect'");
    }

    @Override
    public void disconnect() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'disconnect'");
    }

    @Override
    public CarreraRepository carreraRepository() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'carreraRepository'");
    }

    @Override
    public AlumnoCarreraRepository alumnoCarreraRepository() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alumnoCarreraRepository'");
    }

    @Override
    public DireccionRepository direccionRepository() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'direccionRepository'");
    }

}
