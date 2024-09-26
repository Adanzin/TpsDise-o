package com.example.modelo;

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

@Entity
public class AlumnoCarrera implements Serializable{
    
    @EmbeddedId
    private AlumnoCarreraPK alumnoCarreraPK;

    @ManyToOne
    @MapsId("nroLibreta")
    @JoinColumn(name = "nroLibreta")
    private Alumno alumno;

    @ManyToOne
    @MapsId("idCarrera")
    @JoinColumn(name = "idCarrera")
    private Carrera carrera;

    @Column(nullable = false)
    private Date fechaInscripcion;

    @Column(nullable = false)
    private boolean finalizada;

    public AlumnoCarrera(AlumnoCarreraPK alumnoCarreraPK, Date fechaInscripcion, boolean finalizada) {
        this.alumnoCarreraPK = alumnoCarreraPK;
        this.fechaInscripcion = fechaInscripcion;
        this.finalizada = finalizada;
    }

    public AlumnoCarrera() {}

    public AlumnoCarreraPK getAlumnoCarreraPK() {
        return alumnoCarreraPK;
    }

    public void setAlumnoCarreraPK(AlumnoCarreraPK alumnoCarreraPK) {
        this.alumnoCarreraPK = alumnoCarreraPK;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    

}
