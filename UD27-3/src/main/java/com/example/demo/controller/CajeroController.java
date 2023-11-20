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

import com.example.demo.dto.Cajero;
import com.example.demo.service.CajeroService;

@RestController
@RequestMapping("cajeros")
public class CajeroController {
	@Autowired
	CajeroService service;
	
	@GetMapping("")
	public List<Cajero> listAll(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Cajero getById(@PathVariable Integer id){
		return service.getById(id);
	}
	@PostMapping("")
	public Cajero addVenta(@RequestBody Cajero venta){
		return service.saveEntity(venta);
	}
	@PutMapping("/{id}")
	public Cajero updateVenta(@RequestBody Cajero cajero,@PathVariable Integer id ){
		Cajero cajeroActualizar = service.getById(id);
		return service.saveEntity(cajeroActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id){
		service.deleteById(id);
	}
}
