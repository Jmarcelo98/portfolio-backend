package com.jmarcelo.backend.domain;

import java.io.Serializable;

public class Experiencia implements Serializable {
	private static final long serialVersionUID = 1L;

	private int ano;
	private int mes;

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

}
