
public class OperadoresDeIncrementoEDecremento {
	public static void main(String[] args) {
		int idade = 10;
		idade++;
		System.out.println("Idade: " + idade);
		// � o mesmo que
		idade = idade + 1;
		// e tamb�m
		idade += 1;
		
		int novaIdade =  idade++;
		System.out.println("Nova Idade: " + novaIdade);
		System.out.println("Idade: " + idade);
		
		novaIdade = ++idade;
		System.out.println("Nova Idade: " + novaIdade);
		System.out.println("Idade: " + idade);
		
		novaIdade = idade--;
		System.out.println("Nova Idade: " + novaIdade);
		System.out.println("Idade: " + idade);
		
		novaIdade = --idade;
		System.out.println("Nova Idade: " + novaIdade);
		System.out.println("Idade: " + idade);
	}
}
