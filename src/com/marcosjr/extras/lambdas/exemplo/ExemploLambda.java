package com.marcosjr.extras.lambdas.exemplo;

import java.util.List;

import com.marcosjr.extras.lambdas.dao.FaturaDAO;
import com.marcosjr.extras.lambdas.modelo.Fatura;
import com.marcosjr.extras.lambdas.util.EnviadorEmail;

public class ExemploLambda {
	
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		EnviadorEmail enviadorEmail = new EnviadorEmail();
		
		/* - Exemplo sem Lambda
		for (Fatura f : faturasVencidas) {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
		} 
		 */
		
		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});
	}

}
