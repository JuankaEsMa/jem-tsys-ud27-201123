package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEquipoDAO;
import com.example.demo.dto.Equipo;

@Service
public class EquipoService implements IEquipoService{

	@Autowired
	IEquipoDAO dao;
	
	@Override
	public List<Equipo> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Equipo getById(String id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Equipo saveEntity(Equipo equipo) {
		// TODO Auto-generated method stub
		return dao.save(equipo);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
