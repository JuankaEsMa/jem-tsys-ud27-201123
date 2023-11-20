package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISuministraDAO;
import com.example.demo.dto.Suministra;

@Service
public class SuministraService implements ISuministraService{

	@Autowired
	ISuministraDAO dao;
	
	@Override
	public List<Suministra> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Suministra getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Suministra saveEntity(Suministra entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
