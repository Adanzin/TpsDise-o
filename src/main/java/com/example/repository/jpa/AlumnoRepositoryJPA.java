package com.example.repository.jpa;

import java.util.List;
import java.util.Optional;

import com.example.entity.Alumno;
import com.example.model.AlumnoFilter;
import com.example.repository.AlumnoRepository;
import com.example.repository.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TemporalType;
import jakarta.persistence.TypedQuery;

public class AlumnoRepositoryJPA extends AlumnoRepository {
    private EntityManager em;

    public AlumnoRepositoryJPA(EntityManager em) {
        this.em = em;
    }

    @Override
    public Alumno save(Alumno entity) {
        em.getTransaction().begin();
        if (entity.getNroLibreta() == null)
            em.persist(entity);
        else
            em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public Optional<Alumno> findById(Integer id) {
        return Optional.ofNullable(em.find(Alumno.class, id));
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
         alumnoFilter.getNombre().ifPresent(nombre -> query.setParameter("nombre", "%"+nombre+"%"));
         alumnoFilter.getApellido().ifPresent(apellido -> query.setParameter("apellido", "%" + apellido + "%"));
         alumnoFilter.getFechaNacimiento().ifPresent(fecha -> query.setParameter("fecha", fecha));
         alumnoFilter.getGenero().ifPresent(genero -> query.setParameter("genero", genero));
        return query.getResultList();
    }

    public List<Alumno> findByIdCarreraAndCiudadOrigen(Integer idCarrera, String ciudadResidencia) {

        String sqlQuery = "SELECT DISTINCT e FROM Alumno e " +
                "JOIN AlumnoCarrera ec ON (e.nroLibreta = ec.id.nroLibreta) " +
                "JOIN Direccion d ON (d.id = e.direccion) " +
                "WHERE ec.id.idCarrera = :idCarrera " +
                "AND d.ciudad = :ciudad";

        TypedQuery<Alumno> query = em.createQuery(sqlQuery, Alumno.class);
        query.setParameter("idCarrera", idCarrera);
        query.setParameter("ciudad", ciudadResidencia);
        return query.getResultList();
    }

    public List<Alumno> findAllSortBy(String columnaOrder) {

        String sqlQuery = "SELECT e FROM Alumno e " +
                "ORDER BY e."+columnaOrder+" ASC";

        TypedQuery<Alumno> query = em.createQuery(sqlQuery, Alumno.class);
        return query.getResultList();
    }

}
