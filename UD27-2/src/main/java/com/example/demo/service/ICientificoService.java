package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cientifico;

public interface ICientificoService {
	public List<Cientifico> listAll();
	public Cientifico getEntityById(String id);
	public Cientifico saveEntity(Cientifico entity);
	public void deleteEntity(String id);
}
