package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPiezaDAO;
import com.example.demo.dto.Pieza;

@Service
public class PiezaService implements IPiezaService{

	@Autowired
	IPiezaDAO dao;
	
	@Override
	public List<Pieza> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Pieza getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Pieza saveEntity(Pieza entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
