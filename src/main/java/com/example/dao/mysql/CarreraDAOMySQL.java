package com.example.dao.mysql;


import java.util.List;

import com.example.dao.CarreraDAO;
import com.example.modelo.Alumno;

import jakarta.persistence.EntityManager;

public class CarreraDAOMySQL implements CarreraDAO {
    private EntityManager em;

    public CarreraDAOMySQL(EntityManager em){ //Obligatorio
        super();
        this.em = em;
    }

    @Override
    public void insert(Alumno alumno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void update(Alumno alumno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Alumno alumno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Alumno getById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<Alumno> getList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getList'");
    }
}
