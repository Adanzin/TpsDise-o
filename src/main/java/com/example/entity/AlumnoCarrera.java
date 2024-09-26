package com.example.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "AlumnoCarrera")
public class AlumnoCarrera implements Serializable{
    
    @EmbeddedId
    private AlumnoCarreraPK alumnoCarreraPK;

    @ManyToOne
    @MapsId("idCarrera") // Mapea la clave foránea idCarrera
    @JoinColumn(name = "idCarrera")
    private Carrera carrera;

    @ManyToOne
    @MapsId("nroLibreta") // Mapea la clave foránea nroLibreta
    @JoinColumn(name = "nroLibreta")
    private Alumno alumno;

    @Column(nullable = false)
    private int anioInscripcion;

    @Column(nullable = false)
    private boolean finalizada;

    public AlumnoCarrera(AlumnoCarreraPK alumnoCarreraPK, int anioInscripcion, boolean finalizada) {
        this.alumnoCarreraPK = alumnoCarreraPK;
        this.anioInscripcion = anioInscripcion;
        this.finalizada = finalizada;
    }

    public AlumnoCarrera() {}

    public AlumnoCarreraPK getAlumnoCarreraPK() {
        return alumnoCarreraPK;
    }

    public void setAlumnoCarreraPK(AlumnoCarreraPK alumnoCarreraPK) {
        this.alumnoCarreraPK = alumnoCarreraPK;
    }

    public int getAnioInscripcion() {
        return anioInscripcion;
    }

    public void setAnioInscripcion(int anioInscripcion) {
        this.anioInscripcion = anioInscripcion;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    
}
