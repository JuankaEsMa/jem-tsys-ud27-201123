package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cajero;

public interface ICajeroService {
	public List<Cajero> listAll();
	public Cajero getById(Integer id);
	public Cajero saveEntity(Cajero cajero);
	public void deleteById(Integer id);
}
