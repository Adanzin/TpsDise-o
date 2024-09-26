package com.example.factory;

import com.example.entity.AlumnoCarrera;
import com.example.repository.AlumnoCarreraRepository;
import com.example.repository.AlumnoRepository;
import com.example.repository.CarreraRepository;
import com.example.repository.DireccionRepository;

public abstract class ConnectionFactory {

    public abstract void connect();
    public abstract void disconnect();

    public abstract AlumnoRepository alumnoRepository();
    public abstract CarreraRepository carreraRepository();
    public abstract AlumnoCarreraRepository alumnoCarreraRepository();
    public abstract DireccionRepository direccionRepository();

}
