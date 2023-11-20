package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductoDAO;
import com.example.demo.dto.Producto;

@Service
public class ProductoService implements IProductoService{
	@Autowired
	IProductoDAO dao;

	@Override
	public List<Producto> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Producto getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Producto saveEntity(Producto producto) {
		// TODO Auto-generated method stub
		return dao.save(producto);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
}
