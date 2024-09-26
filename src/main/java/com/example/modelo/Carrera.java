package com.example.modelo;

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
	private int idCarrera;

    @Column(unique = true)
	private String nombreCarrera;

    @OneToMany
    @JoinColumn(name = "idCarrera")
    private List<AlumnoCarrera> alumnoCarrera;
}
