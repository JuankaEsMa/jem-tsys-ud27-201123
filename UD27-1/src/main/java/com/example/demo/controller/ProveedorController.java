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

import com.example.demo.dto.Proveedor;
import com.example.demo.service.ProveedorService;

@RestController
@RequestMapping("proveedores")
public class ProveedorController {
	
	@Autowired
	ProveedorService service;
	
	public List<Proveedor> listAllProveedores(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Proveedor getProveedorById(@PathVariable String id) {
		return service.getById(id);
	}
	@PostMapping("")
	public Proveedor addProveedor(@RequestBody Proveedor proveedor) {
		return service.saveEntity(proveedor);
	}
	@PutMapping("/{id}")
	public Proveedor updateProveedor(@RequestBody Proveedor proveedor, @PathVariable String id) {
		Proveedor proveedorActualizar = service.getById(id);
		proveedorActualizar.setNombre(proveedor.getNombre());
		return service.saveEntity(proveedorActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteProveedorById(@PathVariable String id) {
		service.deleteById(id);
	}
}

