package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Proyecto {
	@Id
	private String id;
	private String nombre;
	private int horas;
	@ManyToMany(mappedBy = "proyectos")
    @JsonIgnoreProperties("proyectos")
    private List<Cientifico> cientificos;
	
	public Proyecto() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public List<Cientifico> getCientificos() {
		return cientificos;
	}
	public void setCientificos(List<Cientifico> estudiantes) {
		this.cientificos = estudiantes;
	}
}
