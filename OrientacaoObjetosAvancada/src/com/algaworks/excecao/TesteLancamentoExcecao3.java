package com.algaworks.excecao;

public class TesteLancamentoExcecao3 {
	
	private static void metodoQuePodeLancarExcecao() {
		// RuntimeException � uma exce��o n�o checada
		RuntimeException zebra = new RuntimeException("Deu zebra!");
		throw zebra;
	}
	public static void main(String[] args) {
		metodoQuePodeLancarExcecao();
	}
	
}
