package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proveedor;

public interface IProveedorService {
	public List<Proveedor> listAll();
	public Proveedor getById(String id);
	public Proveedor saveEntity(Proveedor entity);
	public void deleteById(String id);
}
