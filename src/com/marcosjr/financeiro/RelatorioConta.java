package com.marcosjr.financeiro;

import com.marcosjr.financeiro.modelo.Conta;

public class RelatorioConta {
	
	public void exibirListagem(Conta[] contas) {
		
		System.out.println("_________________________________________________________");
		System.out.println("          RELATÓRIO DE CONTAS A PAGAR E RECEBER          ");
		System.out.println("_________________________________________________________");
		
		for (Conta conta : contas) {
			conta.exibirDetalhes();
			System.out.println("_________________________________________________________");
		}
	}

}
