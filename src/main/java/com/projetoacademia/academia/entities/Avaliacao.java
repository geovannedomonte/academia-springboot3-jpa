package com.projetoacademia.academia.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Avaliacao implements Serializable{
	private static final long serialVersionUID = 1L;
	
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
	private Date momento;
	
	public Avaliacao() {
	}
	
	

	public Avaliacao(Long id, Double peso, Double altura, Double imc, Double gorduraCorporal, Double massaMuscular,
			Double circunferenciaDoBraco, Double circunferenciaDaCintura, Double circunferenciaDaCoxa, Double cardio,
			String avaliacao, Date momento) {
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

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
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
