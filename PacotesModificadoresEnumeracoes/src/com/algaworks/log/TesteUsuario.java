package com.algaworks.log;

public class TesteUsuario {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("João");
		Usuario usuario2 = new Usuario("Sebastião");
		usuario1.logar();
		usuario2.logar();
		
		System.out.println(Usuario.getTotalUsuariosLogados());

	}
}
