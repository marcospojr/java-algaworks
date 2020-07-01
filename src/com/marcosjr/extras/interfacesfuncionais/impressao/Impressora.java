package com.marcosjr.extras.interfacesfuncionais.impressao;

import com.marcosjr.extras.interfacesfuncionais.compra.Compra;

@FunctionalInterface
public interface Impressora {
	
	public void imprimir(Compra compra);

}
