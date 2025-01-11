package com.projetoacademia.academia.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoacademia.academia.entities.Instrutor;

@RestController
@RequestMapping(value = "/instrutores")
public class InstrutorResource {
	
	@GetMapping
	public ResponseEntity<Instrutor> findAll(){
		Instrutor instru = new Instrutor(1L, "Carlos Araujo", "Carlos@gmail.com", "123456");
		return ResponseEntity.ok().body(instru);
	}
		

}
