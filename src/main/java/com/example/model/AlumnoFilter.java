package com.example.model;

import java.lang.foreign.Linker.Option;
import java.sql.Date;
import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AlumnoFilter {
    
	
    private Optional<Integer> nroLibreta = Optional.empty();

    
	private Optional<Long> dni = Optional.empty();

	
	private Optional<String> nombre = Optional.empty();

    
	private Optional<String> apellido = Optional.empty();

    
	private Optional<Date> fechaNacimiento = Optional.empty();

	
	private Optional<String> genero = Optional.empty();

    public AlumnoFilter() {}

    public AlumnoFilter(Optional<Integer> nroLibreta, Optional<Long> dni, Optional<String> nombre,
            Optional<String> apellido, Optional<Date> fechaNacimiento, Optional<String> genero) {
        this.nroLibreta = nroLibreta;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }


    public Optional<Integer> getNroLibreta() {
        return nroLibreta;
    }


    public void setNroLibreta(Optional<Integer> nroLibreta) {
        this.nroLibreta = nroLibreta;
    }


    public Optional<Long> getDni() {
        return dni;
    }


    public void setDni(Optional<Long> dni) {
        this.dni = dni;
    }


    public Optional<String> getNombre() {
        return nombre;
    }


    public void setNombre(Optional<String> nombre) {
        this.nombre = nombre;
    }


    public Optional<String> getApellido() {
        return apellido;
    }


    public void setApellido(Optional<String> apellido) {
        this.apellido = apellido;
    }


    public Optional<Date> getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(Optional<Date> fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public Optional<String> getGenero() {
        return genero;
    }


    public void setGenero(Optional<String> genero) {
        this.genero = genero;
    }

    

}
