package com.example.repository.jdbc;

import java.util.List;
import java.util.Optional;

import com.example.entity.Alumno;
import com.example.model.AlumnoFilter;
import com.example.repository.AlumnoRepository;

public class AlumnoRepositoryJDBC extends AlumnoRepository{

    @Override
    public Alumno save(Alumno entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Alumno> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Alumno> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void delete(Alumno entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Alumno> findAllByFilter(AlumnoFilter alumnoFilter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllByFilter'");
    }

    @Override
    public List<Alumno> findByIdCarreraAndCiudadOrigen(Integer idCarrera, String ciudadResidencia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIdCarreraAndCiudadOrigen'");
    }

    @Override
    public List<Alumno> findAllSortBy(String columnaOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllSortBy'");
    }

}
