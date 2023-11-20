package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Cientifico;
import com.example.demo.dto.Proyecto;
import com.example.demo.service.CientificoService;
import com.example.demo.service.ProyectoService;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/cientificos")
public class CientificoController {
	@Autowired
	CientificoService service;
	@Autowired
	ProyectoService proyectoService;
	@Autowired
    private EntityManager entityManager;
	
	@GetMapping("")
	public List<Cientifico> listAllCientificos(){
		return service.listAll();
	}
	@GetMapping("/{id}")
	public Cientifico getCientificoById(@PathVariable String id) {
		return service.getEntityById(id);
	}
	@PostMapping("")
	public Cientifico addCientifico(@RequestBody Cientifico cientifico) {
		return service.saveEntity(cientifico);
	}
	@PutMapping("/{id}")
	public Cientifico updateCientifico(@RequestBody Cientifico cientifico, @PathVariable String id) {
		Cientifico cientificoActualizar = service.getEntityById(id);
		cientificoActualizar.setNomApels(cientifico.getNomApels());
		return service.saveEntity(cientificoActualizar);
	}
	@DeleteMapping("/{id}")
	public void deleteCientifico(@PathVariable String id) {
		service.deleteEntity(id);
	}
	@PostMapping("/{id}")
	@Transactional
	public ResponseEntity<String> salvarEstudianteCurso(@RequestBody Proyecto proyecto, @PathVariable(name="id")String id) {
	    // Guarda el estudiante
		Proyecto proyectoGuardar = proyectoService.getEntityById(proyecto.getId());

	    // Obtiene el curso por su ID
	    Cientifico cientifico = service.getEntityById(id);

	    // Asocia el estudiante con el curso
	    if (proyectoGuardar != null) {
	        cientifico.getProyectos().add(proyectoGuardar);
	        proyectoGuardar.getCientificos().add(cientifico);
	        entityManager.persist(cientifico);
	        entityManager.persist(proyectoGuardar);
	    }

	    return ResponseEntity.ok("Proyecto asociado con éxito al cientifico");
	    
	}
	
}
