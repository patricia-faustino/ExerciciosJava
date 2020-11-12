package com.algaworks.excecao;

public class TesteLancamentoExcecao2 {
	private static void metodoUm() throws Exception{
		Exception zebra = new Exception("Deu Zebra!");
		throw zebra;
	}
	private static void metodoDois() throws Exception{
		metodoUm();
	}
	private static void metodoTres() throws Exception{
		try {
			metodoDois();
		} catch (Exception e) {
			System.out.println("Erro no método três.");
			
			// relança a exceção
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			metodoTres();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
