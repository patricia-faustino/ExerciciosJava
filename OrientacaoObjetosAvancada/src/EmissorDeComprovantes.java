public class EmissorDeComprovantes {

	public void emitirComprovantes(Transacao...transacoes) {
		for(Transacao transacao : transacoes) {
			transacao.emitirComprovante();
		}
	}
}
