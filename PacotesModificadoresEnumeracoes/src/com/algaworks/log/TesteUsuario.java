package com.algaworks.log;

public class TesteUsuario {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Jo�o");
		Usuario usuario2 = new Usuario("Sebasti�o");
		usuario1.logar();
		usuario2.logar();
		
		System.out.println(Usuario.getTotalUsuariosLogados());

	}
}
