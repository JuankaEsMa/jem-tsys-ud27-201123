package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Producto;

public interface IProductoService {
	public List<Producto> listAll();
	public Producto getById(Integer id);
	public Producto saveEntity(Producto producto);
	public void deleteById(Integer id);
}
