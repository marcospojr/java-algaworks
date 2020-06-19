package com.marcosjr.fjoo.string;

public class ExemplosClasseString7 {
	
	public static void main(String[] args) {
//		métodos split para remover um caracter especifico
		
		String s = "Cursos_online_de_desenvolvimento_de_software";
		
		String[] array = s.split("_");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]=" + array[i]);
		}
	}
	
}
