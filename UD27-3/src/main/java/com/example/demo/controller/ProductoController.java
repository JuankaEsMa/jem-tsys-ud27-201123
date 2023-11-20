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

import com.example.demo.dto.Producto;
import com.example.demo.service.ProductoService;

@RestController
@RequestMapping("productos")
public class ProductoController {
	@Autowired
	ProductoService service;
	
	@GetMapping("")
	public List<Producto> listAll(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Producto getById(@PathVariable Integer id){
		return service.getById(id);
	}
	@PostMapping("")
	public Producto addVenta(@RequestBody Producto producto){
		return service.saveEntity(producto);
	}
	@PutMapping("/{id}")
	public Producto updateVenta(@RequestBody Producto producto,@PathVariable Integer id ){
		Producto productoActualizar = service.getById(id);
		return service.saveEntity(productoActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id){
		service.deleteById(id);
	}
}
