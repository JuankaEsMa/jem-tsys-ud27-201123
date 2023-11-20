package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Reserva;
import com.example.demo.service.ReservaService;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
	@Autowired
	ReservaService service;
	
	@GetMapping("")
	public List<Reserva> listAll(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Reserva getById(@PathVariable Integer id) {
		return service.getById(id);
	}
	@PostMapping("")
	public Reserva add(@RequestBody Reserva reserva) {
		return service.saveEntity(reserva);
	}
	@PutMapping("/{id}")
	public Reserva update(@RequestBody Reserva reserva, @PathVariable Integer id) {
		Reserva reservaActualizar = service.getById(id);
		reservaActualizar.setInvestigador(reserva.getInvestigador());
		reservaActualizar.setEquipo(reserva.getEquipo());	
		return service.saveEntity(reservaActualizar);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.deleteById(id);
	}
}
