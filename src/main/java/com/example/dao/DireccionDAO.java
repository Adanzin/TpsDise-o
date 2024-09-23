package com.example.dao;

import java.util.List;

import com.example.modelo.Direccion;

public interface DireccionDAO {
    public void insert(Direccion direccion);

	public void update(Direccion direccion);

	public void delete(Direccion direccion);

	public Direccion getById(int id);

	public List<Direccion> getList();
}
