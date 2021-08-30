package com.jmarcelo.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmarcelo.backend.service.IdadeService;

@RestController
@RequestMapping(value = "/idade")
public class IdadeResourcers {

	@Autowired
	private IdadeService idadeService;

	@CrossOrigin
	@GetMapping
	public ResponseEntity<Integer> buscarIdade() {

		int idade = idadeService.buscarIdade();

		return ResponseEntity.ok().body(idade);

	}

}
