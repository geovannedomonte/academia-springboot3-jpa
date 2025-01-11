package com.projetoacademia.academia.resources;

import java.sql.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoacademia.academia.entities.Avaliacao;

@RestController
@RequestMapping(value = "/avaliacoes")
public class AvaliacaoResource {
	
	 @GetMapping
	    public ResponseEntity<Avaliacao> findAll() {
	        
	        Date momento = new Date(2025 - 1900, 0, 12); // Ano - 1900, mês começa em 0, dia
	        Avaliacao aval = new Avaliacao(1L, 85.0, 1.85, 50.0, 30.0, 50.0, 55.0, 98.0, 88.0, 120.0, "O aluno apresenta condições para atividades físicas", momento);
	        return ResponseEntity.ok().body(aval);
	    }

}
