package com.jmarcelo.backend.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class IdadeService {

	final int ANO_NASCIMENTO = 1998;
	final int MES_NASCIMENTO = 11;
	final int DIA_NASCIMENTO = 16;

	public int buscarIdade() {

		Calendar dataNascimento = Calendar.getInstance();

		dataNascimento.set(ANO_NASCIMENTO, MES_NASCIMENTO, DIA_NASCIMENTO);

		Calendar dataAtual = Calendar.getInstance();

		int ano = dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

		if (dataAtual.get(Calendar.MONTH) + 1 < dataNascimento.get(Calendar.MONTH)) {
			ano--;
		}

		if (dataAtual.get(Calendar.MONTH) + 1 == dataNascimento.get(Calendar.MONTH)
				&& dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
			ano--;
		}

		return ano;

	}

}
