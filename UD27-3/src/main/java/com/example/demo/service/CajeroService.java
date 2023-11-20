package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajeroDAO;
import com.example.demo.dto.Cajero;

@Service
public class CajeroService implements ICajeroService{

	@Autowired
	ICajeroDAO dao;
	
	@Override
	public List<Cajero> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Cajero getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Cajero saveEntity(Cajero cajero) {
		// TODO Auto-generated method stub
		return dao.save(cajero);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
