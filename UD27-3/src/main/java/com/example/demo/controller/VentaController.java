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

import com.example.demo.dto.Venta;
import com.example.demo.service.VentaService;

@RestController
@RequestMapping("ventas")
public class VentaController {
	
	@Autowired
	VentaService service;
	
	@GetMapping("")
	public List<Venta> listAll(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Venta getById(@PathVariable Integer id){
		return service.getById(id);
	}
	@PostMapping("")
	public Venta addVenta(@RequestBody Venta venta){
		return service.saveEntity(venta);
	}
	@PutMapping("/{id}")
	public Venta updateVenta(@RequestBody Venta venta,@PathVariable Integer id ){
		Venta ventaActualizar = service.getById(id);
		return service.saveEntity(ventaActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id){
		service.deleteById(id);
	}
}
