package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProveedorDAO;
import com.example.demo.dto.Proveedor;

@Service
public class ProveedorService implements IProveedorService{

	@Autowired
	IProveedorDAO dao;
	
	@Override
	public List<Proveedor> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Proveedor getById(String id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Proveedor saveEntity(Proveedor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
