package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVentaDAO;
import com.example.demo.dto.Venta;

@Service
public class VentaService implements IVentaService{
	@Autowired
	IVentaDAO dao;

	@Override
	public List<Venta> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Venta getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Venta saveEntity(Venta venta) {
		// TODO Auto-generated method stub
		return dao.save(venta);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
}
