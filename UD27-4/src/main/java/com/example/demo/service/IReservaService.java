package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Reserva;

public interface IReservaService {
	public List<Reserva> listAll();
	public Reserva getById(Integer id);
	public Reserva saveEntity(Reserva reserva);
	public void deleteById(Integer id);
}
