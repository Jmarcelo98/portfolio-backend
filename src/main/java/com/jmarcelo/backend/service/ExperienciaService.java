package com.jmarcelo.backend.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import com.jmarcelo.backend.domain.Experiencia;

@Service
public class ExperienciaService {

	Calendar dataDeInicio = Calendar.getInstance();
	Calendar dataAtual = Calendar.getInstance();

	final int ANO_INICIO = 2021;
	final int MES_INICIO = 9;
	final int DIA_INICIO = 1;

	public Experiencia calcularTempoExperiencia() {

		int mes = 0;

		Experiencia experiencia = new Experiencia();

		dataDeInicio.set(ANO_INICIO, MES_INICIO, DIA_INICIO);

		int ano = dataAtual.get(Calendar.YEAR) - dataDeInicio.get(Calendar.YEAR);

		if ( (dataAtual.get(Calendar.MONTH) + 1) < dataDeInicio.get(Calendar.MONTH)) {
			ano--;
			mes = (dataAtual.get(Calendar.MONTH) + 1) - dataDeInicio.get(Calendar.MONTH);
			mes = 12 + mes;

		} else {
			mes = (dataAtual.get(Calendar.MONTH) + 1) - dataDeInicio.get(Calendar.MONTH);
		}

		if (ano < 0) {
			experiencia.setAno(0);
			experiencia.setMes(0);
		} else {
			experiencia.setAno(ano);
			experiencia.setMes(mes);
		}

		return experiencia;

	}

}
