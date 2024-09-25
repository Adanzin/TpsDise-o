package com.example.factory;

import com.example.repository.jpa.AlumnoRepositoryJPA;

public abstract class ConnectionFactory {

    public abstract void connect();
    public abstract void disconnect();

    public abstract AlumnoRepositoryJPA alumnoRepository();

}
