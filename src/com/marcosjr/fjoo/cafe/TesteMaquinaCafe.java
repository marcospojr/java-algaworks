package com.marcosjr.fjoo.cafe;

public class TesteMaquinaCafe {
	public static void main(String[] args) {
		MaquinaCafe cafe = new MaquinaCafe();
		
		cafe.setAcucarDisponivel(30);
		
		//fazer o café com 10g
		cafe.fazerCafe();
		//fazer o café com 20g
		cafe.fazerCafe(20);
		//tentar fazer o café com 10g, porém sem açucar disponível
		cafe.fazerCafe();
	}
}
