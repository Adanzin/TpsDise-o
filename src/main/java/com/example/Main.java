package com.example;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.example.entity.Alumno;
import com.example.entity.AlumnoCarrera;
import com.example.entity.AlumnoCarreraPK;
import com.example.entity.Carrera;
import com.example.entity.Direccion;
import com.example.factory.ConnectionFactory;
import com.example.factory.JDBCConnectionFactory;
import com.example.factory.JPAConnectionFactory;
import com.example.model.AlumnoFilter;
import com.example.model.CarreraInscriptos;
import com.example.model.ReporteCarrera;
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
        
        //Dar de alta un alumno
        Alumno alum = new Alumno(24513664, "Carlitos","Perez","2024-09-26", "Masculino");
        connFactory.alumnoRepository().save(alum);

        //matricular un estudiante en una carrera
        AlumnoCarreraPK pk = new AlumnoCarreraPK(1,5);
        AlumnoCarrera ac = new AlumnoCarrera(pk,2010,true);
        connFactory.alumnoCarreraRepository().save(ac);

        //Lista ordenada por criterio columna
        List<Alumno> list = connFactory.alumnoRepository().findAllSortBy("nombre");
        for (Alumno alumno : list) {
            System.out.println(alumno.toString());
        }

        //Buscar alumno por nro libreta
        Optional<Alumno> al = connFactory.alumnoRepository().findById(1);
        System.out.println(al.get().toString());

        //Filtrar por criterios alumno - por ejemplo genero
        AlumnoFilter filter = new AlumnoFilter();
        filter.setGenero(Optional.of("Masculino"));
        filter.setNombre(Optional.of("Jua"));
        List<Alumno> list1 = connFactory.alumnoRepository().findAllByFilter(filter);
        for (Alumno alumno : list1) {
            System.out.println(alumno.toString());
        }

        //recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
        List<CarreraInscriptos> list3 = connFactory.carreraRepository().findCarreraInscriptos();
        for (CarreraInscriptos carrera : list3) {
            System.out.println(carrera.toString());
        }

        //recuperar alumnos por carrera y residencia
        List<Alumno> list2 = connFactory.alumnoRepository().findByIdCarreraAndCiudadOrigen(1, "La Plata");
        for (Alumno alumno : list2) {
            System.out.println(alumno.toString());
        }
        
        //recuperar reporte
        List<ReporteCarrera> list4 = connFactory.carreraRepository().findReporteCarrera();
        for (ReporteCarrera carrera : list4) {
            System.out.println(carrera.toString());
        }
        


        
    }
}

