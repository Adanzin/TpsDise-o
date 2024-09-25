package com.example.modelo;

import java.util.Objects;

import javax.persistence.ManyToOne;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;

@Embeddable
public class AlumnoCarreraPK {

    @ManyToOne
    @JoinColumn(name = "IdAlumno")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "IdCarrera")
    private Carrera carrera;

    public AlumnoCarreraPK() {
    };

    public AlumnoCarreraPK(Alumno alumno, Carrera carrera) {
        this.alumno = alumno;
        this.carrera = carrera;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlumnoCarreraPK alumnoCarreraPK = (AlumnoCarreraPK) o;
        return alumno.equals(alumnoCarreraPK.alumno) && carrera.equals(alumnoCarreraPK.carrera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alumno, carrera);
    }

}
