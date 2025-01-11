package com.projetoacademia.academia.entities;

import java.io.Serializable;
import java.sql.Date;

public class Instrutor extends Usuario implements Serializable{
	private static final long serialVersionUID = 1L;

	public Instrutor() {
		super();
	}

	public Instrutor(Long id, String nome, String email, String password) {
		super(id, nome, email, password);
	}
	
    public Avaliacao cadastrarAvaliacao(   // metodo
            Long id,
            Double peso,
            Double altura,
            Double gorduraCorporal,
            Double massaMuscular,
            Double circunferenciaDoBraco,
            Double circunferenciaDaCintura,
            Double circunferenciaDaCoxa,
            Double cardio,
            String avaliacaoTexto,
            Date momento
        ) {
            
            Double imc = peso / (altura * altura); // Calcula o IMC

            
            Avaliacao avaliacao = new Avaliacao(                               // Cria uma nova avaliação
                id, peso, altura, imc, gorduraCorporal, massaMuscular,
                circunferenciaDoBraco, circunferenciaDaCintura, circunferenciaDaCoxa,
                cardio, avaliacaoTexto, momento
            );

            // Aqui você pode salvar a avaliação no banco de dados (se necessário)

            System.out.println("Avaliação cadastrada com sucesso!");
            return avaliacao; // Retorna o objeto Avaliacao criado
        }

	
	

}
