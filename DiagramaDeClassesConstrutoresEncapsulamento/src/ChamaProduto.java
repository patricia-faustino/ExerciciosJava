public class ChamaProduto {
	public static void main(String[] args) {
		Produto produto = new Produto();
		// produto.estoque = 20; //não compila
		// produto.imprimirEstoque(); // não compila
		produto.adicionarEstoque(10);
		produto.retirarEstoque(8);
		System.out.println(produto.obterEstoque());
	}
}
