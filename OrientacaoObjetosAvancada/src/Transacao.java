public abstract class Transacao {
	private String descricao;
	private double valor;
	private String data;
	
	
	public Transacao(String descricao, double valor, String data) {
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}
	
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public abstract void emitirComprovante();
}
