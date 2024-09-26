package com.example.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarrera;

    @Column(unique = true)
    private String nombreCarrera;

    @OneToMany
    @JoinColumn(name = "idCarrera")
    private List<AlumnoCarrera> alumnoCarrera;

    @Override
    public String toString() {
        return "Carrera{" +
                "idCarrera=" + idCarrera +
                ", nombreCarrera='" + nombreCarrera + '\'' +
                ", cantidadAlumnos=" + (alumnoCarrera != null ? alumnoCarrera.size() : 0) +
                '}';
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public List<AlumnoCarrera> getAlumnoCarrera() {
        return alumnoCarrera;
    }

    public void setAlumnoCarrera(List<AlumnoCarrera> alumnoCarrera) {
        this.alumnoCarrera = alumnoCarrera;
    }

    
}
