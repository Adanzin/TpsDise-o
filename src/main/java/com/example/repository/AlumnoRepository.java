package com.example.repository;

import java.util.List;

import com.example.entity.Alumno;
import com.example.model.AlumnoFilter;

public abstract class AlumnoRepository implements Repository<Alumno, Integer>{
    public abstract List<Alumno> findAllByFilter(AlumnoFilter alumnoFilter);
    public abstract List<Alumno> findByIdCarreraAndCiudadOrigen(Integer idCarrera, String ciudadResidencia);
    public abstract List<Alumno> findAllSortBy(String columnaOrder);
}
