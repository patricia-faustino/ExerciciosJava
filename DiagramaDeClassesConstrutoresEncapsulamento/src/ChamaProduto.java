public class ChamaProduto {
	public static void main(String[] args) {
		Produto produto = new Produto();
		// produto.estoque = 20; //n�o compila
		// produto.imprimirEstoque(); // n�o compila
		produto.adicionarEstoque(10);
		produto.retirarEstoque(8);
		System.out.println(produto.obterEstoque());
	}
}
