package com.algaworks.caixa;

import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Cielo;
import com.algaworks.pagamento.Redecard;
import com.algaworks.pagamento.Operadora;
import com.algaworks.impressao.Impressora;
import com.algaworks.impressao.ImpressoraEpson;
import com.algaworks.impressao.ImpressoraQualquer;


public class TesteCheckout {

	public static void main(String[] args) {
		
		Operadora operadora = new Redecard();
		Impressora impressora = new ImpressoraQualquer();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		

	}

}
