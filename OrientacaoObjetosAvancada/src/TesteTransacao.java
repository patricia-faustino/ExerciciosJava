
public class TesteTransacao {
	public static void main(String[] args) {
		Transacao transferencia = new Transferencia("Aluguel", 15000, "10/08/2013", "0000000000000", "111111111111");
		transferencia.emitirComprovante();
		
		PagamentoBoleto pagtoBoleto = new PagamentoBoleto("Condomínio", 450, "26/08/2013", "1234 1234 1234", "27/08/2013", "Edíficio Ana Gisele");
		
		EmissorDeComprovantes emissao = new EmissorDeComprovantes();
		emissao.emitirComprovantes(transferencia, pagtoBoleto);
		
		Transacao transacao = new PagamentoBoleto("Condomínio", 450, "26/08/2013", "1234 1234 1234", "27/08/2013", "Edifício da Praça Redonda");
		Object obj = pagtoBoleto;
		
		// não compila
		//PagamentoBoleto pagtoBoleto2 = transacao;
		
		PagamentoBoleto pagtoBoleto2 =(PagamentoBoleto) transacao;
		System.out.println(pagtoBoleto2.getLinhaDigitavel());
		
		Transacao  transacao2 = new Transferencia("Aluguel", 1500, "10/08/2013", "27/08/2013", "0001000965");
		//compila mas dá erro em tempo de execução
		//PagamentoBoleto pagtoBoleto3 = (PagamentoBoleto) transacao2;
		
		/*PagamentoBoleto pagtoBoleto = new PagamentoBoleto();
		pagtoBoleto.setDescricao("Condomínio");
		pagtoBoleto.setValor(450);
		pagtoBoleto.setData("26/08/2013");
		pagtoBoleto.setLinhaDigitavel("1234 1234 1234");
		pagtoBoleto.setDataVencimento("27/08/2013");
		pagtoBoleto.setCedente("Edíficio Ana Gisele");
		pagtoBoleto.emitirComprovante();
		
		Transferencia transferencia = new Transferencia();
		transferencia.setDescricao("Aluguel");
		transferencia.setValor(15000);
		transferencia.setData("10/08/2013");
		transferencia.setContaOrigem("0000000000000");
		transferencia.setContaDestino("111111111111");
		transferencia.emitirComprovante();
		
		Transacao transferencia2 = new Transferencia();
		transferencia2.setDescricao("Aluguel");
		transferencia2.setValor(1500);
		transferencia2.setData("10/08/2013");*/
		
		
	}
}
