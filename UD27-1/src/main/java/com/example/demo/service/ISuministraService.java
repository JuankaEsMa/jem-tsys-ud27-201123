package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Suministra;

public interface ISuministraService {
	public List<Suministra> listAll();
	public Suministra getById(Integer id);
	public Suministra saveEntity(Suministra entity);
	public void deleteById(Integer id);
}
