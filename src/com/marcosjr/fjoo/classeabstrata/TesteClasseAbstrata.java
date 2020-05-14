package com.marcosjr.fjoo.classeabstrata;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TesteClasseAbstrata {
	
	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		Produto p = new ProdutoPerecivel();
		p.descricao = "Caixa de leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "2021/11/16";
		
		p.imprimirDescricao();
		
	}
}
