package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Equipo;

public interface IEquipoService {
	public List<Equipo> listAll();
	public Equipo getById(String id);
	public Equipo saveEntity(Equipo equipo);
	public void deleteById(String id);
}
