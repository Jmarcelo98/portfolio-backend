package com.jmarcelo.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmarcelo.backend.domain.Experiencia;
import com.jmarcelo.backend.service.ExperienciaService;

@RestController
@RequestMapping(value = "/data")
public class ExperienciaResources {

	@Autowired
	private ExperienciaService experienciaService;

	@GetMapping
	@CrossOrigin
	public ResponseEntity<Experiencia> experiencia() {

		Experiencia exp = experienciaService.calcularTempoExperiencia();

		return ResponseEntity.ok().body(exp);

	}

}
