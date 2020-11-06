public class Produto {
	public String nome;
	private int estoque;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getEstoque() {
		return this.estoque;
	}
	
	
	public void adicionarEstoque(int estoque) {
		this.estoque += estoque;
		this.verificarEstoqueMinimo();
	}
	
	public void retirarEstoque(int estoque) {
		this.estoque -= estoque;
		this.verificarEstoqueMinimo();
	}
	
	public void verificarEstoqueMinimo() {
		if(this.obterEstoque() < 5) {
			System.out.println("Abaixo do estoque mínimo: " + this.obterEstoque());
		}
	}
	
	public int obterEstoque() {
		return this.estoque;
	}
	
	public void zerarEstoque() {
		this.estoque = 0;
	}
	
	
}
