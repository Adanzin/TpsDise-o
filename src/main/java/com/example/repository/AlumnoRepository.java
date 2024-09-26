package com.example.repository;

import java.util.List;

import com.example.entity.Alumno;
import com.example.model.AlumnoFilter;

public abstract class AlumnoRepository implements Repository<Alumno, Integer>{
    public abstract List<Alumno> findAllByFilter(AlumnoFilter alumnoFilter);
}
