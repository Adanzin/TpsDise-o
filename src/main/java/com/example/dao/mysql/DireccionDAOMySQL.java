package com.example.dao.mysql;

import java.util.List;

import com.example.dao.DireccionDAO;
import com.example.modelo.Direccion;

import jakarta.persistence.EntityManager;

public class DireccionDAOMySQL implements DireccionDAO {
    private EntityManager em;    

    public DireccionDAOMySQL(EntityManager em){ //Obligatorio
        super();
        this.em = em;
    }

    @Override
    public void insert(Direccion direccion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void update(Direccion direccion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Direccion direccion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Direccion getById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<Direccion> getList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getList'");
    }
}