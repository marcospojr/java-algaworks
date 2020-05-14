package com.marcosjr.fjoo.classeabstrata;

public abstract class Produto {
	
	public abstract void imprimirDescricao();

	public String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
