package com.example;

import java.util.List;
import java.util.Optional;

import com.example.entity.Alumno;
import com.example.factory.ConnectionFactory;
import com.example.factory.JDBCConnectionFactory;
import com.example.factory.JPAConnectionFactory;
import com.example.model.AlumnoFilter;
import com.example.utils.Config;

public class Main
{
    public static ConnectionFactory getConnectionFactory() {
        if (Config.getInstance().getProperty("connection.type").equals("JPA")) {
            return new JPAConnectionFactory();
        } else {
            return new JDBCConnectionFactory();
        }
    }

    public static void main( String[] args )
    {
        ConnectionFactory connFactory = getConnectionFactory();
        connFactory.connect();
        AlumnoFilter filter = new AlumnoFilter();
        filter.setNombre(Optional.of("tom"));
        List<Alumno> list = connFactory.alumnoRepository().findAllByFilter(filter);
        for (Alumno alumno : list) {
            System.out.println(alumno.toString());
        }

        //Alumno al = new Alumno(0, null, null, null, null)
        
        
    }
}

