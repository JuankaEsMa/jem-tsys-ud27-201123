package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Investigador;

public interface IInvestigadorService {
	public List<Investigador> listAll();
	public Investigador getById(String id);
	public Investigador saveEntity(Investigador equipo);
	public void deleteById(String id);
}
