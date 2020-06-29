package com.marcosjr.serializandoobjetos;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import com.marcosjr.serializandoobjetos.model.Pessoa;

public class DeserializandoObjeto {
	
	public static void main(String[] args) {
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("marcos.obj"))){
			Pessoa p = (Pessoa) in.readObject();
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			System.out.println("Profissão: " + p.getProfissao());
			
			
		} catch (Exception e) {
			System.err.println("Erro ao converter para a classe Pessoa");
		}
	}

}
