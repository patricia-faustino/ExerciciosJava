public class InstaceOf {
	public static void main(String[] args) {
		Object obj = new Transferencia("Aluguel", 1500, "10/08/2013", "00010000123", "00010000965");
		
		if(obj instanceof PagamentoBoleto) {
			PagamentoBoleto pagtoBoleto = (PagamentoBoleto) obj;
			System.out.println(pagtoBoleto.getLinhaDigitavel());
		} 
		else if(obj instanceof Transacao) {
			Transacao transacao = (Transacao) obj;
			System.out.println(transacao.getDescricao());
		}
	}
}
		
	

