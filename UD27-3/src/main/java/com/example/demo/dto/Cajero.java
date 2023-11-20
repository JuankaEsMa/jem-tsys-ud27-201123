package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajeros")
public class Cajero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nomApels;
	public Cajero() {
	}
	public Cajero(int codigo, String nomApels) {
		super();
		this.codigo = codigo;
		this.nomApels = nomApels;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomApels() {
		return nomApels;
	}
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
}
