package com.example.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name = "select", query = "SELECT p FROM Persona p ")
public class Persona {
    @Id
    private int id;
    @Column(nullable = false)
    private String nombre;
    @Column(name="anios") //para tipos basicos no tiene sentido check de nullable
    private int edad;
    @ManyToOne
    private Direccion domicilio;

    public Persona(){ //Obligatorio
        super();
    }
    
    public Persona(int id, String nombre, int edad, Direccion domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", domicilio=" + domicilio + "]";
    }

}
