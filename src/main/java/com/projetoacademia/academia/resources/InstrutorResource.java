package com.projetoacademia.academia.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoacademia.academia.entities.Instrutor;
import com.projetoacademia.academia.services.InstrutorService;

@RestController
@RequestMapping(value = "/instrutores")
public class InstrutorResource {
	
	@Autowired
	private InstrutorService service;
	
	@GetMapping
	ResponseEntity<List<Instrutor>> findAll(){
			List<Instrutor> list = service.findAll();
			return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Instrutor> findById(@PathVariable Long id){
		Instrutor obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
		

}
