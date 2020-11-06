package com.algaworks.log;

public class Usuario {
	private final String nome;
	private static int totalUsuariosLogados;
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void logar() {
		this.totalUsuariosLogados++;
	}
	
	public void deslogar() {
		this.totalUsuariosLogados--;
	}
	
	public static int getTotalUsuariosLogados() {
		return totalUsuariosLogados;
	}
}
