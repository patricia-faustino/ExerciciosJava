package com.algaworks.pagamento;

public class Cielo implements Operadora{

	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123");
	}
}
