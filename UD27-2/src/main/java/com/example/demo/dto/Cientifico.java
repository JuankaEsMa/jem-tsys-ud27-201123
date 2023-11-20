package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cientificos")
public class Cientifico {
	@Id
	private String dni;
	private String nomApels;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "asignado_a",
        joinColumns = { @JoinColumn(name = "cientifico") },
        inverseJoinColumns = { @JoinColumn(name = "proyecto")}
    )    
    @JsonIgnoreProperties("cientificos")
    List<Proyecto> proyectos;
	
	public Cientifico() {
		
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
	public List<Proyecto> getProyectos() {
		return proyectos;
	}
	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
}
