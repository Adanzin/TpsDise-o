package com.example.modelo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;

@Entity
public class Alumno {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int nroLibreta;

    @Column(unique = true)
	private long dni;

	@Column(nullable = false)
	private String nombre;

    @Column(nullable = false)
	private String apellido;

    @Column(nullable = false)
	private Date fechaNacimiento;

	@Column(nullable = false)
	private String genero;

	private int partidas;

	public Alumno() {
		super();
	}

	public Alumno(long dNI, String nombre, String apellido, Date fechaNacimiento, String genero,
            int partidas) {
        this.dni = dNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.partidas = partidas;
    }

}
