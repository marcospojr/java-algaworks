package com.marcosjr.financeiro.modelo;

public class ContaPagar extends Conta{

	private Fornecedor fornecedor;
	
	public ContaPagar() {
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		// chamando o construtor sem parâmetros
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void exibirDetalhes() {
		System.out.println("_________________________________________________________");
		System.out.println("                   Detalhes ContaPagar                   ");
		System.out.println("_________________________________________________________");
		System.out.println("Fornecedor: " + fornecedor.getNome());
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$ " + valor);
		System.out.println("Data de Vencimento: " + dataVencimento);
	}

	public void pagar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já está paga: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que está cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Pagando conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do fornecedor " + this.getFornecedor().getNome() + ".");
				
			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}