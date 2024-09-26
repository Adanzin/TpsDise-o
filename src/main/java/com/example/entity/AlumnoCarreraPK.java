package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.ManyToOne;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Embeddable
public class AlumnoCarreraPK implements Serializable{

    private Integer nroLibreta;
    private Integer idCarrera;

    public AlumnoCarreraPK() {
    }

    public AlumnoCarreraPK(int nroLibreta, int idCarrera) {
        this.nroLibreta = nroLibreta;
        this.idCarrera = idCarrera;
    }

    public Integer getNroLibreta() {
        return nroLibreta;
    }

    public void setNroLibreta(Integer nroLibreta) {
        this.nroLibreta = nroLibreta;
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    };

    // Equals y HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlumnoCarreraPK)) return false;
        AlumnoCarreraPK that = (AlumnoCarreraPK) o;
        return idCarrera == that.idCarrera && nroLibreta == that.nroLibreta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarrera, nroLibreta);
    }

    

    

}
