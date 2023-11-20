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

import com.example.demo.dto.Facultad;
import com.example.demo.service.FacultadService;

@RestController
@RequestMapping("/facultades")
public class FacultadController {
	@Autowired
	FacultadService service;
	
	@GetMapping("")
	public List<Facultad> listAll(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Facultad getById(@PathVariable Integer id) {
		return service.getById(id);
	}
	@PostMapping("")
	public Facultad add(@RequestBody Facultad facultad) {
		return service.saveEntity(facultad);
	}
	@PutMapping("/{id}")
	public Facultad update(@RequestBody Facultad facultad, @PathVariable Integer id) {
		Facultad equipoActualizar = service.getById(id);
		equipoActualizar.setNombre(facultad.getNombre());
		return service.saveEntity(equipoActualizar);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.deleteById(id);
	}
}
