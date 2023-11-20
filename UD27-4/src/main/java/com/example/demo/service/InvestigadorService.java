package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IInvestigadorDAO;
import com.example.demo.dto.Investigador;

@Service
public class InvestigadorService implements IInvestigadorService{

	@Autowired
	IInvestigadorDAO dao;
	
	@Override
	public List<Investigador> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Investigador getById(String id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Investigador saveEntity(Investigador equipo) {
		// TODO Auto-generated method stub
		return dao.save(equipo);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
