package com.marcosjr.extras.stream.teste;

import java.util.List;

import com.marcosjr.extras.stream.dao.FaturaDAO;
import com.marcosjr.extras.stream.modelo.Fatura;

public class Teste {

	public static void main(String[] args) {
	
		List<Fatura> faturas = new FaturaDAO().buscarFaturasVencidas();
		
		// Não altera a lista original (faturas)
		/*
		faturas.stream()
				.filter(f -> f.getValor() > 250)
				.forEach(f -> System.out.println(f));;
		*/		
		
		faturas.stream()
				.filter(Fatura::estaEmRisco)
				.forEach(System.out::println);
		
				
	//	faturas.forEach(f -> System.out.println(f));
		
	// 	streamFatura.forEach(f -> System.out.println(f));
		
	}
}
