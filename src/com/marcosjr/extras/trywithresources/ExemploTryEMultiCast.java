package com.marcosjr.extras.trywithresources;

import java.util.Scanner;

public class ExemploTryEMultiCast {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
		
			System.out.print("Informe seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Informe sua idade: ");
			String idade = entrada.nextLine();
			
			try {
				SalvarAluno.salvar(nome, idade);
			} catch (NegocioException | NumberFormatException e) { // Multicast
				System.err.println("Impossível completar operação. Motivo: " + e.getMessage());
			} 
		} 
	}
	
}