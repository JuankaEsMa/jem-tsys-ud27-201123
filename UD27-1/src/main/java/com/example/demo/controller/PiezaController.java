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

import com.example.demo.dto.Pieza;
import com.example.demo.service.PiezaService;

@RestController
@RequestMapping("piezas")
public class PiezaController {
	
	@Autowired
	PiezaService service;
	
	@GetMapping("")
	public List<Pieza> listAll(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Pieza getPiezaById(@PathVariable Integer id){
		return service.getById(id);
	}
	@PostMapping("")
	public Pieza addPieza(@RequestBody Pieza pieza){
		return service.saveEntity(pieza);
	}
	@PutMapping("/{id}")
	public Pieza updatePieza(@RequestBody Pieza pieza, @PathVariable Integer id){
		Pieza piezaActualizada = service.getById(id);
		piezaActualizada.setNombre(pieza.getNombre());
		return service.saveEntity(piezaActualizada);
	}
	@DeleteMapping("/{id}")
	public List<Pieza> listPiezas(){
		return service.listAll();
	}
}
