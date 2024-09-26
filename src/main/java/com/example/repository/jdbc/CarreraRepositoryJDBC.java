package com.example.repository.jdbc;

import java.util.List;
import java.util.Optional;

import com.example.entity.Carrera;
import com.example.model.CarreraInscriptos;
import com.example.model.ReporteCarrera;
import com.example.repository.CarreraRepository;

public class CarreraRepositoryJDBC extends CarreraRepository {

    @Override
    public Carrera save(Carrera entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Carrera> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Carrera> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void delete(Carrera entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<CarreraInscriptos> findCarreraInscriptos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findCarreraInscriptos'");
    }

    @Override
    public List<ReporteCarrera> findReporteCarrera() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findReporteCarrera'");
    }

}
