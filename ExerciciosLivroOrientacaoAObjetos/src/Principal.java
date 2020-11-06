public class Principal {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco();
		endereco1.logradouro =  "Rua Cosme de Farias";
		endereco1.numero = 53;
		endereco1.bairro = "Cosme de Farias";
		endereco1.cidade = "Salvador";
		endereco1.uf = "BA";
		
		Proprietario dono1 =  new Proprietario();
		dono1.nome = "Joana da Silva";
		dono1.cpf = "888.888.888-88";
		dono1.idade = 42;
		dono1.endereco = endereco1;
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.tipoCombustivel = "Bicombustível";
		meuCarro.valorDeMercado = 30000;
		meuCarro.proprietario = dono1;
		
		
		Endereco endereco2 = new Endereco();
		endereco2.logradouro =  "Avenida Baixo do Alto do Cruzeiro";
		endereco2.numero = 43;
		endereco2.bairro = "Cosme de Farias";
		endereco1.cidade = "Salvador";
		endereco1.uf = "BA";
		
		Proprietario dono2 =  new Proprietario();
		dono2.nome = "Felix Felipe";
		dono2.cpf = "777.777.777-77";
		dono2.idade = 28;
		dono2.endereco = endereco2;
		
		
		Carro seuCarro = new Carro();
		seuCarro.anoDeFabricacao = 2009;
		seuCarro.cor = "Preto";
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.tipoCombustivel = "Gasolina";
		seuCarro.valorDeMercado = 45000;
		seuCarro.proprietario = dono2;
		

		
		System.out.println("Meu carro");
		System.out.println("------------------------------------------------------------");
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
		meuCarro.ligar();
		
		System.out.println();
		
		System.out.println("Seu carro");
		System.out.println("------------------------------------------------------------");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoDeFabricacao);
		seuCarro.ligar();
	}
}
