package com.algaworks.rh.folha;

public class Holerite {
	private String nomeFuncionario;
	private double salarioBruto;
	private Deducao[] deducoes;
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public Deducao[] getDeducoes() {
		return deducoes;
	}
	
	public void setDeducoes(Deducao[] deducoes) {
		this.deducoes = deducoes;
	}
	
	public double getSalarioLiquido() {
		double salarioLiquido = getSalarioBruto();
		for(Deducao deducao: getDeducoes()) {
			salarioLiquido -= deducao.getValor();
		}
		return salarioLiquido;
	}
	
}
