package com.example;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import com.example.dao.mysql.AlumnoDAOMySQL;

public class Main
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ejemplo");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        /*Direccion d = new Direccion(3,"Tandil","25 de mayo 188");
        em.persist(d);
        Direccion d1 = new Direccion(4,"Tandil","San lorenzo 415");
        em.persist(d1);
        Persona p = new Persona(5,"Juan",22,d);
        Persona p2 = new Persona(6,"Milagros",20,d);
        em.persist(p);
        em.persist(p2);*/
        AlumnoDAOMySQL j = em.find(AlumnoDAOMySQL.class, 1);
        System.out.println(j);
        List<AlumnoDAOMySQL> personas = em.createQuery("SELECT p FROM Persona p").getResultList();
        personas.forEach(p -> System.out.println(p));
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

