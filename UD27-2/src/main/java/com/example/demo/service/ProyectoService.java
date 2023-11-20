package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProyectoDAO;
import com.example.demo.dto.Proyecto;

@Service
public class ProyectoService implements IProyectoService{

	@Autowired
	IProyectoDAO dao;
	
	@Override
	public List<Proyecto> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Proyecto getEntityById(String id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Proyecto saveEntity(Proyecto entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public void deleteEntity(String id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
