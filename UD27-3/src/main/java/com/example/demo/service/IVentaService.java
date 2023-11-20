package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Venta;

public interface IVentaService {
	public List<Venta> listAll();
	public Venta getById(Integer id);
	public Venta saveEntity(Venta venta);
	public void deleteById(Integer id);
}
