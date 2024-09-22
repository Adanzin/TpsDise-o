package com.example.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Direccion {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    String ciudad;
    @Column
    String calle;

    public Direccion() {
    }

    public Direccion(int id, String ciudad, String calle) {
        this.ciudad = ciudad;
        this.id = id;
        this.calle = calle;
    }

    public int getId() {
        return id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Direccion [id=" + id + ", ciudad=" + ciudad + ", calle=" + calle + "]";
    }

     
}
