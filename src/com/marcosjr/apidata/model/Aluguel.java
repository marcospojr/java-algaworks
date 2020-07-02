package com.marcosjr.apidata.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {
	
	private Cliente cliente;
	private Carro carro;
	
	private LocalDateTime dataRetirada;
	private LocalDateTime dataPrevistaDevolucao;
	private LocalDateTime dataRealDevolucao;
	
	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataRetirada, LocalDateTime dataPrevistaDevolucao) {
		super();
		this.cliente = cliente;
		this.carro = carro;
		this.dataRetirada = dataRetirada;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public LocalDateTime getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(LocalDateTime dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public LocalDateTime getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}
	public void setDataPrevistaDevolucao(LocalDateTime dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}
	public LocalDateTime getDataRealDevolucao() {
		return dataRealDevolucao;
	}
	public void setDataRealDevolucao(LocalDateTime dataRealDevolucao) {
		this.dataRealDevolucao = dataRealDevolucao;
	}


	public void imprimeFatura() {
		Duration duration = Duration.between(dataPrevistaDevolucao, dataRealDevolucao);
		System.out.println(">>>>>>>>>>>>>>>>>>> FATURA <<<<<<<<<<<<<<<<<<<<<<<");
		if(!duration.isNegative()) {
			double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
			System.out.printf("Valor da multa: R$ " + multa + " pois você atrasou %d horas\n", duration.toHours());
		}
		else {
			System.out.println("Obrigado pela pontualidade!");
		}
	}

}
