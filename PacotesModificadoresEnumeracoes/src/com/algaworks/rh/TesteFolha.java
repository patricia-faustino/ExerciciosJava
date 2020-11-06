package com.algaworks.rh;
import com.algaworks.rh.folha.Deducao;
import com.algaworks.rh.folha.Holerite;


public class TesteFolha {
	
		public static void main(String[] args) {
			Deducao inss = new Deducao();
			inss.setNome("INSS");
			inss.setValor(64);
			
			Deducao valeTransporte = new Deducao();
			valeTransporte.setNome("Vale Transporte");
			valeTransporte.setValor(48);
			
			Holerite holerite = new Holerite();
			holerite.setNomeFuncionario("Jo�o das Couves");
			holerite.setSalarioBruto(800);
			holerite.setDeducoes(new Deducao[] {inss, valeTransporte});
			
			System.out.println("Sal�rio l�quido: " + holerite.getSalarioLiquido());
		}
	

}
