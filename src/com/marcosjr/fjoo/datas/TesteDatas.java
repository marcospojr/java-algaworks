package com.marcosjr.fjoo.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {

	public static void main(String[] args) {
		Date hoje = new Date();
		
		DateFormat formatador = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss");
		System.out.println(formatador.format(hoje));
		
		String dataAniversario = "20/08/2019";
		DateFormat formatadorNiver = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date aniversario = formatadorNiver.parse(dataAniversario);
			System.out.println(aniversario);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
