package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMaquinaDAO;
import com.example.demo.dto.MaquinaRegistradora;

@Service
public class MaquinaService implements IMaquinaService{

	@Autowired
	IMaquinaDAO dao;
	
	@Override
	public List<MaquinaRegistradora> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public MaquinaRegistradora getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public MaquinaRegistradora saveEntity(MaquinaRegistradora maquina) {
		// TODO Auto-generated method stub
		return dao.save(maquina);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
