package com.marcosjr.fjoo.classeabstrata;

public class ProdutoPerecivel extends Produto{

	protected String dataValidade;
	
	public void imprimirDescricao() {
		System.out.println("Descrição: " + getDescricao() + "\nVencendo em: " + dataValidade);
	}
}
