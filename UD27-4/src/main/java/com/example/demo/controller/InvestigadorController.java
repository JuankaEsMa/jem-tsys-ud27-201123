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

import com.example.demo.dto.Investigador;
import com.example.demo.service.InvestigadorService;

@RestController
@RequestMapping("/investigadores")
public class InvestigadorController {
	@Autowired
	InvestigadorService service;
	
	@GetMapping("")
	public List<Investigador> listAll(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Investigador getById(@PathVariable String id) {
		return service.getById(id);
	}
	@PostMapping("")
	public Investigador add(@RequestBody Investigador equipo) {
		return service.saveEntity(equipo);
	}
	@PutMapping("/{id}")
	public Investigador update(@RequestBody Investigador investigador, @PathVariable String id) {
		Investigador investigadorActualizar = service.getById(id);
		investigadorActualizar.setNomApels(investigador.getNomApels());
		investigadorActualizar.setFacultad(investigador.getFacultad());	
		return service.saveEntity(investigadorActualizar);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		service.deleteById(id);
	}
}
