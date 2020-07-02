package com.marcosjr.apidata.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.marcosjr.apidata.model.Aluguel;
import com.marcosjr.apidata.model.Carro;
import com.marcosjr.apidata.model.Cliente;

public class DevolucaoCarro {

	public static void main(String[] args) {
		// 46 * 9 = 414
		Aluguel aluguel = recuperarAluguel();
		
		// Para cada hora de atraso, ele paga 10% do valor do carro em multa
		LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
		aluguel.setDataRealDevolucao(dataEHoraRealDaDevolucao);
		aluguel.imprimeFatura();
	}

	private static Aluguel recuperarAluguel() {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));

		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
				LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now()
				.plusDays(3).plusHours(2);
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		return aluguel;
	}

}