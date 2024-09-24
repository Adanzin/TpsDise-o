package com.example.factory;

import com.example.repository.jpa.AlumnoRepository;

public abstract class ConnectionFactory {

    public abstract void connect();
    public abstract void disconnect();

    public abstract AlumnoRepository alumnoRepository();

}
