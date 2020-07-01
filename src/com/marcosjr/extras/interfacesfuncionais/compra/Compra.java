package com.marcosjr.extras.interfacesfuncionais.compra;

public class Compra {

	private String produto;
	private double valor;
	
	public Compra(String produto, double valor) {
		this.produto = produto;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Produto: " + produto + ". Valor: " + valor;
	}

}
