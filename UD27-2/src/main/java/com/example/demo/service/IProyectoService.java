package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proyecto;

public interface IProyectoService {
	public List<Proyecto> listAll();
	public Proyecto getEntityById(String id);
	public Proyecto saveEntity(Proyecto entity);
	public void deleteEntity(String id);
}
