package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICientificoDAO;
import com.example.demo.dto.Cientifico;

@Service
public class CientificoService implements ICientificoService{

	@Autowired
	ICientificoDAO dao;
	
	@Override
	public List<Cientifico> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Cientifico getEntityById(String id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Cientifico saveEntity(Cientifico entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public void deleteEntity(String id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
