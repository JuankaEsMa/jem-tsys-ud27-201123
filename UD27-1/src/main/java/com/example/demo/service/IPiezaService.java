package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pieza;

public interface IPiezaService {
	public List<Pieza> listAll();
	public Pieza getById(Integer id);
	public Pieza saveEntity(Pieza entity);
	public void deleteById(Integer id);
}
