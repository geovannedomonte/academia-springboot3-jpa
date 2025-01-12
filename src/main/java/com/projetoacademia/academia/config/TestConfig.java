package com.projetoacademia.academia.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoacademia.academia.entities.Administrador;
import com.projetoacademia.academia.entities.Avaliacao;
import com.projetoacademia.academia.entities.Instrutor;
import com.projetoacademia.academia.entities.Usuario;
import com.projetoacademia.academia.repositories.AdministradorRepository;
import com.projetoacademia.academia.repositories.AvaliacaoRepository;
import com.projetoacademia.academia.repositories.InstrutorRepository;
import com.projetoacademia.academia.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository; //injeção de dependencia
	
	@Autowired
	private InstrutorRepository instrutorRepository;
	
	@Autowired
	private AdministradorRepository administradorRepository;
	
	@Autowired
	private AvaliacaoRepository avaliacaoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Geovanne do Monte", "geovanne@gmail.com", "123456");
		Usuario u2 = new Usuario(null, "Fernanda Gomes", "fgomes@gamail.com", "123456");
		Usuario u3 = new Usuario(null, "Ana fontes", "fpntes@gamail.com", "123456");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));
		
		Instrutor inst1 = new Instrutor(null, "João Cardoso", "jcardoso55@gmail.com", "123456");
		Instrutor inst2 = new Instrutor(null, "Juliana Andadre", "jujua@gmail.com", "123456");
		
		instrutorRepository.saveAll(Arrays.asList(inst1, inst2));
		
		Administrador adm1 = new Administrador(null, "Alberto Torres", "admtorres@gmail.com", "123456");
		
		administradorRepository.saveAll(Arrays.asList(adm1));
		
		Avaliacao aval1 = new Avaliacao(null, 85.0, 1.85, null, 30.0, 55.5, 20.0, 55.8, 40.0, 120.0, "Aluno consirado aprovado para atividade física", null);
		
		avaliacaoRepository.saveAll(Arrays.asList(aval1));
		
		
		
		
	}

}
