package com.marcosjr.fjoo.cafe;

public class MaquinaCafe {
	private int acucarDisponivel;
	
	public void fazerCafe () {
		fazerCafe(10);
	}
	
	public void fazerCafe (int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("Não há açucar suficiente!");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo café com " + quantidadeAcucar + " gramas de açucar...");
		}
	}

	public int getAcucarDisponivel() {
		return acucarDisponivel;
	}

	public void setAcucarDisponivel(int acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}
}
