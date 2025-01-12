package com.projetoacademia.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoacademia.academia.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
