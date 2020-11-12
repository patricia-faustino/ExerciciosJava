
public class PagamentoBoleto  extends Transacao{
	private String linhaDigitavel;
	private String dataVencimento;
	private String cedente;
	
	public PagamentoBoleto(String descricao, double valor, String data, String linhaDigitavel, String dataVencimento, String cedente) {
		super(descricao, valor, data);
		
		this.linhaDigitavel = linhaDigitavel;
		this.dataVencimento = dataVencimento;
		this.cedente = cedente;
	}
	public String getLinhaDigitavel() {
		return linhaDigitavel;
	}
	public void setLinhaDigitavel(String linhaDigitavel) {
		this.linhaDigitavel = linhaDigitavel;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getCedente() {
		return cedente;
	}
	public void setCedente(String cedente) {
		this.cedente = cedente;
	}

	public void emitirComprovante() {

		System.out.println("Comprovante da transação");
		System.out.println("========================");
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Data: " + this.getData());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Linha Digitavel: " + this.getLinhaDigitavel());
		System.out.println("Data de Vencimento: " + this.getDataVencimento());
		System.out.println("Cedente :" + this.getCedente());
		System.out.println();
	}

}
