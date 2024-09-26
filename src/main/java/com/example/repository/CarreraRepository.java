package com.example.repository;

import java.util.List;

import com.example.entity.Carrera;
import com.example.model.CarreraInscriptos;
import com.example.model.ReporteCarrera;

public abstract class CarreraRepository implements Repository<Carrera, Integer> {
    public abstract List<CarreraInscriptos> findCarreraInscriptos();
    public abstract List<ReporteCarrera> findReporteCarrera();
}
