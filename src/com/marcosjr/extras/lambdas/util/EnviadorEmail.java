package com.marcosjr.extras.lambdas.util;

public class EnviadorEmail {

	public void enviar(String email, Object resumo) {
		System.out.println("Enviando e-mail para: " + email + ". Com texto: \"" + resumo + "\"");
	}

}
