package com.projetoacademia.academia.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_administrador")
public class Administrador extends Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Administrador() {
		super();
	}

	public Administrador(Long id, String nome, String email, String password) {
		super(id, nome, email, password);
	}
	
	

}
