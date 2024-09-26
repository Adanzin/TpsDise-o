package com.example.entity;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Alumno implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nroLibreta;

    @Column(unique = true, nullable = false)
	private long dni;

	@Column(nullable = false)
	private String nombre;

    @Column(nullable = false)
	private String apellido;

    @Column(nullable = false)
	private Date fechaNacimiento;

	@Column(nullable = false)
	private String genero;

	@OneToMany
	@JoinColumn(name = "nroLibreta")
	private List<AlumnoCarrera> alumnoCarrera;

	@OneToOne
	private Direccion direccion;

	public Alumno() {
		super();
	}

	public Alumno(long dNI, String nombre, String apellido, String fechaStr, String genero) {
        this.dni = dNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaStr;
        this.genero = genero;
    }

	public Integer getNroLibreta() {
		return nroLibreta;
	}

	public void setNroLibreta(Integer nroLibreta) {
		this.nroLibreta = nroLibreta;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<AlumnoCarrera> getAlumnoCarrera() {
		return alumnoCarrera;
	}

	public void setAlumnoCarrera(List<AlumnoCarrera> alumnoCarrera) {
		this.alumnoCarrera = alumnoCarrera;
	}

	@Override
	public String toString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String fechaNacimientoFormatted = (fechaNacimiento != null) ? dateFormat.format(fechaNacimiento) : "N/A";
    
    return "Alumno {" +
            "nroLibreta=" + nroLibreta +
            ", dni=" + dni +
            ", nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", fechaNacimiento=" + fechaNacimientoFormatted +
            ", genero='" + genero + '\'' +
            '}';
}

}
