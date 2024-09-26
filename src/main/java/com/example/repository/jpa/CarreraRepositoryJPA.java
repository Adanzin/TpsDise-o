package com.example.repository.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.text.html.parser.Entity;

import com.example.entity.Alumno;
import com.example.entity.Carrera;
import com.example.model.CarreraInscriptos;
import com.example.model.ReporteCarrera;
import com.example.repository.CarreraRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class CarreraRepositoryJPA extends CarreraRepository {
    private EntityManager em;

    @Override
    public Carrera save(Carrera entity) {
        em.getTransaction().begin();
        if (entity.getIdCarrera() == null)
            em.persist(entity);
        else
            em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public Optional<Carrera> findById(Integer id) {
        return Optional.ofNullable(em.find(Carrera.class, id));
    }

    @Override
    public List<Carrera> findAll() {
        return em.createQuery("SELECT c FROM Carrera c", Carrera.class).getResultList();
    }

    @Override
    public void delete(Carrera entity) {
        em.refresh(entity);
    }

    public CarreraRepositoryJPA(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<CarreraInscriptos> findCarreraInscriptos() {
        String sqlQuery = "SELECT c.nombreCarrera, " +
                "SUM(CASE WHEN ac.finalizada = false THEN 1 ELSE 0 END) as inscriptos " +
                "FROM AlumnoCarrera ac " +
                "JOIN ac.carrera c " +
                "GROUP BY c.nombreCarrera " +
                "ORDER BY SUM(CASE WHEN ac.finalizada = false THEN 1 ELSE 0 END) DESC";

        TypedQuery<Object[]> query = em.createQuery(sqlQuery, Object[].class);
        List<Object[]> registros = query.getResultList();

        return registros
                .stream()
                .map(record -> new CarreraInscriptos((String) record[0], (Long) record[1]))
                .collect(Collectors.toList());

    }

    @Override
    public List<ReporteCarrera> findReporteCarrera() {
        String sqlQuery = "SELECT c.nombreCarrera, ac.anioInscripcion, COUNT(ac.id.nroLibreta) as inscriptos, SUM(CASE WHEN ac.finalizada = false THEN 0 ELSE 1 END) as graduados " +
                "FROM AlumnoCarrera ac " +
                "JOIN ac.carrera c " +
                "GROUP BY c.nombreCarrera, ac.anioInscripcion " +
                "ORDER BY c.nombreCarrera ASC, ac.anioInscripcion ASC";

        TypedQuery<Object[]> query = em.createQuery(sqlQuery, Object[].class);
        List<Object[]> registros = query.getResultList();

        List<ReporteCarrera> result = new ArrayList<>();

        registros.forEach(record -> {
            ReporteCarrera reporteCarrera = new ReporteCarrera((String) record[0]);
            if (!result.contains(reporteCarrera)){
                result.add(reporteCarrera);
            }
            result.get(result.indexOf(reporteCarrera)).getDetalleAnual().add(new ReporteCarrera.DetalleReporteCarrera((Integer) record[1], (Long) record[2], (Long) record[3]));
        });
        return result;

    }
}
