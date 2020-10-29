import java.util.Scanner;

public class EstruturaCondicional1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		float peso = entrada.nextFloat();
		
		System.out.print("Altura: ");
		double altura = (entrada.nextDouble()) / 100;
		
		double imc = peso / (altura * altura);
		
		if(imc < 18.5) {
			System.out.println(nome + ", voc� est� abaixo do peso ideal.");
			System.out.println("Entre em nossos sistemas e acione um nutricionista. Podemos te ajudar a ver a alimenta��o de outra forma.");
		} else if(imc >= 18.5 && imc < 25) {
			System.out.println(nome + ", seu peso � ideal.");
			System.out.println("Entre em nossos sistemas e acione um nutricionista. Podemos te ajudar a ver a alimenta��o de outra forma.");
		} else if(imc >= 25 && imc < 30) {
			System.out.println(nome +", voc� est� acima do peso.");
			System.out.println("Entre em nossos sistemas e acione um nutricionista. Podemos te ajudar a ver a alimenta��o de outra forma.");
		} else if(imc >= 30 && imc <35) {
			System.out.println( nome + "o seu grau de obesidade � I.");
			System.out.println("Entre em nossos sistemas e acione um nutricionista. Podemos te ajudar a ver a alimenta��o de outra forma.");
		} else if(imc >= 35 && imc < 40) {
			System.out.println(nome + "o seu grau de obesidade � II.");
			System.out.println("Entre em nossos sistemas e acione um nutricionista. Podemos te ajudar a ver a alimenta��o de outra forma.");
		} else {
			System.out.println(nome + "o seu grau de obesidade � III");
			System.out.println("Entre em nossos sistemas e acione um nutricionista. Podemos te ajudar a ver a alimenta��o de outra forma.");
		}
		
		entrada.close();
	}
}
