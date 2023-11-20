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

import com.example.demo.dto.Suministra;
import com.example.demo.service.SuministraService;

@RestController
@RequestMapping("suministra")
public class SuministraController {
	@Autowired
	SuministraService service;
	
	@GetMapping("")
	public List<Suministra> listAllSuministros(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Suministra getProveedorById(@PathVariable Integer id) {
		return service.getById(id);
	}
	@PostMapping("")
	public Suministra addProveedor(@RequestBody Suministra suministra) {
		return service.saveEntity(suministra);
	}
	@PutMapping("/{id}")
	public Suministra updateProveedor(@RequestBody Suministra suministra, @PathVariable Integer id) {
		Suministra suministraActualizar = service.getById(id);
		suministraActualizar.setPrecio(suministra.getPrecio());
		suministraActualizar.setPieza(suministra.getPieza());
		suministraActualizar.setProveedor(suministra.getProveedor());
		return service.saveEntity(suministraActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteProveedorById(@PathVariable Integer id) {
		service.deleteById(id);
	}
}
