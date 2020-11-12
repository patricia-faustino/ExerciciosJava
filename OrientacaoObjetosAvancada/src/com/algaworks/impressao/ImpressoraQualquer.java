package com.algaworks.impressao;

public class ImpressoraQualquer  implements Impressora{
	
	public void imprimir(Imprimivel imprimivel) {
		
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * *");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("- - - - - - - - - - - - -  - - - ");
		System.out.println("==           QUALQUER          ==");
		System.out.println("- - - - - - - - - - - - -  - - - ");

	}
}
