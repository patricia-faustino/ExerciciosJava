package com.algaworks.estoque;

public class FechamentoPedido {
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("Mouse");
		produto.adicionarEstoque(10);
		
		System.out.println(produto.getNome() + " - " + produto.getEstoque());
		
	}
	
}
