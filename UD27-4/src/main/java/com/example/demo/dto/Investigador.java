package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Investigador {
	@Id
	private String dni;
	private String nomApels;
	@ManyToOne
    @JoinColumn(name="facultad")
	private Facultad facultad;
	public Investigador() {
		
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNomApels() {
		return nomApels;
	}
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	public Facultad getFacultad() {
		return facultad;
	}
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
}
