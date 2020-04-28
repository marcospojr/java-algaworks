
public class ContaPagar {
	Double valor;
	String descricao;
	String dataVencimento;
	Fornecedor fornecedor;
	
	ContaPagar() {
		
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}
	
	public void pagar() {
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(dataVencimento);
		System.out.println(fornecedor.nome);
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
}
