package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IReservaDAO;
import com.example.demo.dto.Reserva;

@Service
public class ReservaService implements IReservaService{

	@Autowired
	IReservaDAO dao;

	@Override
	public List<Reserva> listAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Reserva getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Reserva saveEntity(Reserva reserva) {
		// TODO Auto-generated method stub
		return dao.save(reserva);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
	
}
