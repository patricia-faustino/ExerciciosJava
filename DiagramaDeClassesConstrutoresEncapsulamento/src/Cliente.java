public class Cliente {
	String nome;
	String cpf;
	
	Cliente(){
		//isso é um construtor
		System.out.println("Construindo cliente...");
	}
	Cliente(String nome){
		this();
		System.out.println("Cliente com nome: " + nome);
		this.nome = nome;
	}
	Cliente(String nome, String cpf){
		this(nome);
		System.out.println("Cpf: " + cpf);
		this.cpf = cpf;
	}
}
