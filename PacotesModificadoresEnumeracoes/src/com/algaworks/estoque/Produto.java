package com.algaworks.estoque;

public class Produto {
	private String nome;
	private int estoque;
	
	String getNome() {
		return this.nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	int getEstoque() {
		return this.estoque;
	}
	
	void adicionarEstoque(int estoque) {
		this.estoque += estoque;
	}
	
	void retirarEstoque(int estoque) {
		this.estoque -= estoque;
	}
	
	
}
