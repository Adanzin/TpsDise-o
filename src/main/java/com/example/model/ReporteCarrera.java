package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class ReporteCarrera {
    public static class DetalleReporteCarrera {
        protected Integer anio;
        protected Long inscriptos;
        protected Long egresados;

        public DetalleReporteCarrera(Integer anio, Long inscriptos, Long egresados) {
            this.anio = anio;
            this.inscriptos = inscriptos;
            this.egresados = egresados;
        }

        @Override
        public String toString() {
            return "Año: " + anio + ", inscriptos: " + inscriptos + ", egresados: " + egresados;
        }
    }

    public List<DetalleReporteCarrera> getDetalleAnual() {
        return this.detalleReporte;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private List<DetalleReporteCarrera> detalleReporte;

    public ReporteCarrera(String nombre) {
        this.nombre = nombre;
        this.detalleReporte = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReporteCarrera{")
                .append("nombre='").append(nombre).append('\'')
                .append(", detalleReporte=[\n");

        for (DetalleReporteCarrera detalle : detalleReporte) {
            sb.append("  ").append(detalle.toString()).append("\n");
        }

        sb.append("]}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        ReporteCarrera reporteCarrera = (ReporteCarrera) o;
        return reporteCarrera.getNombre().equals(nombre);
    }

}
