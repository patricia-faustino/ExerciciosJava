package com.algaworks.excecao;

public class TesteLancamentoExcecao1 {
	public static void main(String[] args) {
		try {
			metodoQuePodeLancarExcecao();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void metodoQuePodeLancarExcecao() throws Exception {
			Exception zebra = new Exception("Deu Zebra!");
			throw zebra;
		}
}

