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

import com.example.demo.dto.MaquinaRegistradora;
import com.example.demo.service.MaquinaService;

@RestController
@RequestMapping("maquinas")
public class MaquinaController {
	@Autowired
	MaquinaService service;
	
	@GetMapping("")
	public List<MaquinaRegistradora> listAll(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public MaquinaRegistradora getById(@PathVariable Integer id){
		return service.getById(id);
	}
	@PostMapping("")
	public MaquinaRegistradora addVenta(@RequestBody MaquinaRegistradora maquina){
		return service.saveEntity(maquina);
	}
	@PutMapping("/{id}")
	public MaquinaRegistradora updateVenta(@RequestBody MaquinaRegistradora maquina,@PathVariable Integer id ){
		MaquinaRegistradora maquinaActualizar = service.getById(id);
		return service.saveEntity(maquinaActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id){
		service.deleteById(id);
	}
}
