package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Facultad;

public interface IFacultadService {
	public List<Facultad> listAll();
	public Facultad getById(Integer id);
	public Facultad saveEntity(Facultad equipo);
	public void deleteById(Integer id);
}
