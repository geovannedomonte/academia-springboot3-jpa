package com.projetoacademia.academia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoacademia.academia.entities.Instrutor;
import com.projetoacademia.academia.repositories.InstrutorRepository;

@Service
public class InstrutorService {
	
	@Autowired
	private InstrutorRepository repository;
	
	public List<Instrutor> findAll(){
		return repository.findAll();
	}
	
	public Instrutor findById(Long id) {
		Optional<Instrutor> obj = repository.findById(id);
		return obj.get();
	}

}
