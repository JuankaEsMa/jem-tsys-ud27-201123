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

import com.example.demo.dto.Proyecto;
import com.example.demo.service.ProyectoService;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {
	
	@Autowired
	ProyectoService service;
	
	@GetMapping("")
	public List<Proyecto> listAllProyectos(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Proyecto getProyectoById(@PathVariable String id) {
		return service.getEntityById(id);
	}
	@PostMapping("")
	public Proyecto addProyecto(@RequestBody Proyecto proyecto) {
		return service.saveEntity(proyecto);
	}
	@PutMapping("/{id}")
	public Proyecto updateProyecto(@RequestBody Proyecto proyecto, @PathVariable String id){
		Proyecto proyectoActualizar = service.getEntityById(id);
		proyectoActualizar.setNombre(proyecto.getNombre());
		proyectoActualizar.setHoras(proyecto.getHoras());
		return service.saveEntity(proyectoActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteProyecto(@PathVariable String id) {
		service.deleteEntity(id);
	}
}
