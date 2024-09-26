package com.example.model;

public class CarreraInscriptos {

    private String nombre;
    private Long totalInscriptos;

    public CarreraInscriptos(String nombre, Long totalInscriptos) {
        this.nombre = nombre;
        this.totalInscriptos = totalInscriptos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTotalInscriptos() {
        return totalInscriptos;
    }

    public void setTotalInscriptos(Long totalInscriptos) {
        this.totalInscriptos = totalInscriptos;
    }

    @Override
    public String toString() {
        return "CarreraInscriptos{" +
                "nombre='" + nombre + '\'' +
                ", totalInscriptos=" + totalInscriptos.toString() +
                '}';
    }

}
