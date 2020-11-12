package com.algaworks.simulacao;

import com.algaworks.audio.Radio;

public class TesteProtected {
	public static void main(String[] args) {
		//Equipamento equipamento = new Equipamento();
		
		// não compila
		//equipamento.ligado =  true;
		
		Radio radio = new Radio();
		radio.ligar();
		System.out.println("radio.isLigado(): " + radio.isLigado());
		
	}

}
