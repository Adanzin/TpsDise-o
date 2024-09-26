package com.example.repository.jpa;

import java.util.List;
import java.util.Optional;

import com.example.entity.Direccion;
import com.example.repository.DireccionRepository;

import jakarta.persistence.EntityManager;

public class DireccionRepositoryJPA extends DireccionRepository{

    //Se obvio la implementacion de esta clase, fue pensada para la relacion de la direccion con el alumno
    private EntityManager em;

    @Override
    public Direccion save(Direccion entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Direccion> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Direccion> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void delete(Direccion entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public DireccionRepositoryJPA(EntityManager em) {
        this.em = em;
    }

    

}
