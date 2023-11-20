package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.MaquinaRegistradora;

public interface IMaquinaService {
	public List<MaquinaRegistradora> listAll();
	public MaquinaRegistradora getById(Integer id);
	public MaquinaRegistradora saveEntity(MaquinaRegistradora maquina);
	public void deleteById(Integer id);
}
