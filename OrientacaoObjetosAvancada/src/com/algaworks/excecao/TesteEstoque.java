package com.algaworks.excecao;

public class TesteEstoque {
	public static void main(String[] args) {
		Produto produto = new Produto (10);
		try {
			produto.baixarEstoque(8);
			produto.baixarEstoque(4);
			produto.baixarEstoque(20);
		} catch(EstoqueInsuficienteException e) {
			e.printStackTrace();
		}
	}
}
