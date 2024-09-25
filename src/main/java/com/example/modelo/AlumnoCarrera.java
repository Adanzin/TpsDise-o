package com.example.modelo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AlumnoCarrera {
    
    @EmbeddedId
    private AlumnoCarreraPK alumnoCarreraPK;

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
