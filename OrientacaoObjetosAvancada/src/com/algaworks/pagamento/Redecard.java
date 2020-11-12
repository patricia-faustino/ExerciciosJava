package com.algaworks.pagamento;

public class Redecard implements Operadora{
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("456") && autorizavel.getValorTotal() < 200;
	}
		
}
