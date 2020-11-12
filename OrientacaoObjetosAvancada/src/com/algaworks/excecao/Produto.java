package com.algaworks.excecao;

public class Produto {
	private int estoque;
	
	public Produto(int estoque) {
		this.estoque = estoque;
	}
	
	public void baixarEstoque(int quantidade)
			throws EstoqueInsuficienteException{
		if(quantidade > this.estoque) {
			throw new EstoqueInsuficienteException("Estoque insuficiente. Estoque atual: " + this.estoque);
		}
		this.estoque -= quantidade;
	}
}
