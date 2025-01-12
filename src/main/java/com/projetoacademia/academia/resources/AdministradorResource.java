package com.projetoacademia.academia.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoacademia.academia.entities.Administrador;

@RestController
@RequestMapping(value  = "/administradores")
public class AdministradorResource {
	
	@GetMapping
	public ResponseEntity<Administrador> findAll(){
		Administrador adm = new Administrador(1L, "Alberto Torres", "admtorres@gmail.com", "123456");
		return ResponseEntity.ok().body(adm);
	}

}
