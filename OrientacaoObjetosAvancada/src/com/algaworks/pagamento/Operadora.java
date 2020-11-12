package com.algaworks.pagamento;

public interface Operadora {
	boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
