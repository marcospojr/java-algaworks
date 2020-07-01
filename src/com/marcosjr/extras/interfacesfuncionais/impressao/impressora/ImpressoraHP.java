package com.marcosjr.extras.interfacesfuncionais.impressao.impressora;

import com.marcosjr.extras.interfacesfuncionais.compra.Compra;
import com.marcosjr.extras.interfacesfuncionais.impressao.Impressora;

public class ImpressoraHP implements Impressora{

	@Override
	public void imprimir(Compra compra) {
		System.out.println("Enviando o comando para a impressora HP -> " + compra);
	}
	
}
