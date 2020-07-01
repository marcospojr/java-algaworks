package com.marcosjr.extras.interfacesfuncionais.teste;

import com.marcosjr.extras.interfacesfuncionais.compra.Compra;
import com.marcosjr.extras.interfacesfuncionais.impressao.Impressora;

public class Teste {
	
	public static void main(String[] args) {
		//Impressora i = new ImpressoraHP();
		
		Impressora i = (c) -> {
			System.out.println("Simulando a impressão. Seria impresso: \n" + c);
		};
		
		Compra compra = new Compra("Sabonete", 2.5);
		i.imprimir(compra);
	}

}
