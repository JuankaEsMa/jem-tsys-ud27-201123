package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Facultad {
	@Id
	private Integer codigo;
	private String nombre;
	public Facultad() {

	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
