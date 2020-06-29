package com.marcosjr.serializandoobjetos;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.marcosjr.serializandoobjetos.model.Pessoa;

public class SerializandoObjeto {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Marcos Pereira");
		p.setIdade(22);
		p.setProfissao("Analista desenvolvedor");
		
		try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("marcos.obj"))){
			output.writeObject(p);
			System.out.println("Objeto salvo com sucesso!");
			
		} catch (Exception e) {
			System.err.println("Erro ao salvar o objeto. " + e.getMessage());
			e.printStackTrace();
		}
	}

}
