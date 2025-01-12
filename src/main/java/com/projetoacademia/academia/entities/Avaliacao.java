package com.projetoacademia.academia.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_avaliacao")
public class Avaliacao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double peso;
	private Double altura;
	private Double imc;
	private Double gorduraCorporal;
	private Double massaMuscular;
	private Double circunferenciaDoBraco;
	private Double circunferenciaDaCintura;
	private Double circunferenciaDaCoxa;
	private Double cardio;
	private String avaliacao;
	private LocalDateTime momento;
	
	public Avaliacao() {
	}
	
	

	public Avaliacao(Long id, Double peso, Double altura, Double imc, Double gorduraCorporal, Double massaMuscular,
			Double circunferenciaDoBraco, Double circunferenciaDaCintura, Double circunferenciaDaCoxa, Double cardio,
			String avaliacao, LocalDateTime momento) {
		super();
		this.id = id;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		this.gorduraCorporal = gorduraCorporal;
		this.massaMuscular = massaMuscular;
		this.circunferenciaDoBraco = circunferenciaDoBraco;
		this.circunferenciaDaCintura = circunferenciaDaCintura;
		this.circunferenciaDaCoxa = circunferenciaDaCoxa;
		this.cardio = cardio;
		this.avaliacao = avaliacao;
		this.momento = momento;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getImc() {
		return imc;
	}

	public void setImc(Double imc) {
		this.imc = imc;
	}

	public Double getGorduraCorporal() {
		return gorduraCorporal;
	}

	public void setGorduraCorporal(Double gorduraCorporal) {
		this.gorduraCorporal = gorduraCorporal;
	}

	public Double getMassaMuscular() {
		return massaMuscular;
	}

	public void setMassaMuscular(Double massaMuscular) {
		this.massaMuscular = massaMuscular;
	}

	public Double getCircunferenciaDoBraco() {
		return circunferenciaDoBraco;
	}

	public void setCircunferenciaDoBraco(Double circunferenciaDoBraco) {
		this.circunferenciaDoBraco = circunferenciaDoBraco;
	}

	public Double getCircunferenciaDaCintura() {
		return circunferenciaDaCintura;
	}

	public void setCircunferenciaDaCintura(Double circunferenciaDaCintura) {
		this.circunferenciaDaCintura = circunferenciaDaCintura;
	}

	public Double getCircunferenciaDaCoxa() {
		return circunferenciaDaCoxa;
	}

	public void setCircunferenciaDaCoxa(Double circunferenciaDaCoxa) {
		this.circunferenciaDaCoxa = circunferenciaDaCoxa;
	}

	public Double getCardio() {
		return cardio;
	}

	public void setCardio(Double cardio) {
		this.cardio = cardio;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliacao other = (Avaliacao) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
