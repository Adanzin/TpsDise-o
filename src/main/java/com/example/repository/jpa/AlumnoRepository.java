package com.example.repository.jpa;

import java.util.List;
import java.util.Optional;

import com.example.modelo.Alumno;
import com.example.repository.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class AlumnoRepository implements Repository<Alumno, Integer> {
    private EntityManager em;


    public AlumnoRepository(EntityManager em){
        this.em = em;
    }

    @Override
    public Alumno save(Alumno entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public Optional<Alumno> findById(Integer id) {
        Alumno al = em.find(Alumno.class, id);
        return Optional.of(al);
    }

    @Override
    public List<Alumno> findAll() {
        TypedQuery<Alumno> query = em.createQuery("SELECT u FROM Alumno u", Alumno.class);
        return query.getResultList();
    }

    @Override
    public void delete(Alumno entity) {
        em.remove(entity);
    }

}
