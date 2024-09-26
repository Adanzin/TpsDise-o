package com.example.repository.jpa;

import java.util.List;
import java.util.Optional;

import com.example.entity.Alumno;
import com.example.model.AlumnoFilter;
import com.example.repository.AlumnoRepository;
import com.example.repository.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class AlumnoRepositoryJPA extends AlumnoRepository {
    private EntityManager em;

    public AlumnoRepositoryJPA(EntityManager em) {
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

    public void metodo() {

    }

    @Override
    public List<Alumno> findAllByFilter(AlumnoFilter alumnoFilter) {

        StringBuilder jpql = new StringBuilder("SELECT u FROM Alumno u WHERE 1=1");
        if (alumnoFilter.getDni().isPresent()) {
            jpql.append(" AND u.dni = :dni");
        }

        if (alumnoFilter.getNombre().isPresent()) {
            jpql.append(" AND u.nombre LIKE :nombre");
        }

        if (alumnoFilter.getApellido().isPresent()) {
            jpql.append(" AND u.apellido LIKE :apellido");
        }

        if (alumnoFilter.getFechaNacimiento().isPresent()) {
            jpql.append(" AND u.fechaNacimiento = :fecha");
        }

        if (alumnoFilter.getGenero().isPresent()) {
            jpql.append(" AND u.genero = :genero");
        }
         TypedQuery<Alumno> query = em.createQuery(
         jpql.toString(),Alumno.class);

         alumnoFilter.getDni().ifPresent(dni -> query.setParameter("dni", dni));
         alumnoFilter.getNombre().ifPresent(nombre -> System.out.println("entre"+nombre));
         alumnoFilter.getNombre().ifPresent(nombre -> query.setParameter("nombre", "%" + "tom"+ "%"));
         alumnoFilter.getApellido().ifPresent(apellido -> query.setParameter("apellido", "%" + apellido + "%"));
         alumnoFilter.getFechaNacimiento().ifPresent(fecha -> query.setParameter("fecha", fecha));
         alumnoFilter.getGenero().ifPresent(genero -> query.setParameter("genero", genero));

        return query.getResultList();
    }

}
