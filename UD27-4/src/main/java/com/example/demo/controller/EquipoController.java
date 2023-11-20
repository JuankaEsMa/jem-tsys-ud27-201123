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

import com.example.demo.dto.Equipo;
import com.example.demo.service.EquipoService;

@RestController
@RequestMapping("/equipos")
public class EquipoController {
	@Autowired
	EquipoService service;
	
	@GetMapping("")
	public List<Equipo> listAll(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Equipo getById(@PathVariable String id) {
		return service.getById(id);
	}
	@PostMapping("")
	public Equipo add(@RequestBody Equipo equipo) {
		return service.saveEntity(equipo);
	}
	@PutMapping("/{id}")
	public Equipo update(@RequestBody Equipo equipo, @PathVariable String id) {
		Equipo equipoActualizar = service.getById(id);
		equipoActualizar.setNombre(equipo.getNombre());
		equipoActualizar.setFacultad(equipo.getFacultad());	
		return service.saveEntity(equipoActualizar);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		service.deleteById(id);
	}
}
