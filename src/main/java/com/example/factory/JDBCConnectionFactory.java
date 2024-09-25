package com.example.factory;

import com.example.repository.jpa.AlumnoRepositoryJPA;

public class JDBCConnectionFactory extends ConnectionFactory {

    @Override
    public AlumnoRepositoryJPA alumnoRepository() {
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

}
