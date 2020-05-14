package com.marcosjr.financeiro.modelo;

public class Conta {
	protected String descricao;
	protected String dataVencimento;
	protected Double valor;
	private SituacaoConta situacaoConta;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValue() {
		return valor;
	}

	public void setValue(Double value) {
		this.valor = value;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

	Conta () {
		
	}
	
	public void cancelar() {
		
	}
}
