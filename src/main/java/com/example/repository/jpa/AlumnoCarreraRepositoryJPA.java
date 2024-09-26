package com.example.repository.jpa;

import java.util.List;
import java.util.Optional;

import com.example.entity.AlumnoCarrera;
import com.example.entity.AlumnoCarreraPK;
import com.example.repository.AlumnoCarreraRepository;

import jakarta.persistence.EntityManager;

public class AlumnoCarreraRepositoryJPA extends AlumnoCarreraRepository {

    private EntityManager em;

    @Override
    public AlumnoCarrera save(AlumnoCarrera entity) {
        em.getTransaction().begin();
        if (entity.getAlumnoCarreraPK() == null)
            em.persist(entity);
        else
            em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public Optional<AlumnoCarrera> findById(AlumnoCarreraPK id) {
        return Optional.ofNullable(em.find(AlumnoCarrera.class, id));
    }

    @Override
    public List<AlumnoCarrera> findAll() {
        // TODO Auto-generated method stub
        return em.createQuery("SELECT ec FROM EstudianteCarrera ec", AlumnoCarrera.class).getResultList();
    }

    @Override
    public void delete(AlumnoCarrera entity) {
        em.remove(entity);
    }

    public AlumnoCarreraRepositoryJPA(EntityManager em) {
        this.em = em;
    }

    

}
