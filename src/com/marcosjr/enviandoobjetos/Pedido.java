package com.marcosjr.enviandoobjetos;

import java.io.Serializable;

public class Pedido implements Serializable{
	//Maquina 1 (server)
	
	private static final long serialVersionUID = 1L;
	private Long codigo;
	private String nome;
	private int quantidade;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
