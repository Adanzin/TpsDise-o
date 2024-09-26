package com.example.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.ManyToOne;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Embeddable
public class AlumnoCarreraPK implements Serializable{

    private int nroLibreta;
    private int idCarrera;

    public AlumnoCarreraPK() {
    }

    public AlumnoCarreraPK(int nroLibreta, int idCarrera) {
        this.nroLibreta = nroLibreta;
        this.idCarrera = idCarrera;
    };

    

}
