package com.example.dao;

import java.util.List;

import com.example.modelo.Alumno;

public interface AlumnoDAO {
    public void insert(Alumno alumno);

	public void update(Alumno alumno);

	public void delete(Alumno alumno);

	public Alumno getById(int id);

	public List<Alumno> getList();

}
