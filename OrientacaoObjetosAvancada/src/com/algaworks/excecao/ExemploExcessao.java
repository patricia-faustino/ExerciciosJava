package com.algaworks.excecao;

public class ExemploExcessao {
	
	public static void main(String[] args) {
		try {
			double x = 4 / 0;
			
		}catch(ArithmeticException ae) {
			System.out.println("Erro na divisão");
			ae.printStackTrace();
		}
	}
	

}
