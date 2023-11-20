package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFacultadDAO;
import com.example.demo.dto.Facultad;

@Service
public class FacultadService implements IFacultadService{

	@Autowired
	IFacultadDAO dao;
	
	@Override
	public List<Facultad> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Facultad getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Facultad saveEntity(Facultad equipo) {
		// TODO Auto-generated method stub
		return dao.save(equipo);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
	
}
